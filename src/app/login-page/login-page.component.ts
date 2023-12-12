import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UtilisateurService } from '../services/utilisateur.service';
import { NgForm } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';
import { ICredentials } from '../models/credentials';
import { Utilisateur } from '../models/utilisateurs';
import { SharedObjectService } from '../services/sharedObject';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.scss']
})
export class LoginPageComponent {
  
  connect: ICredentials = {
    mail: "",
    motDePasse: ""
  }

  constructor(private router: Router, private utilisateurService : UtilisateurService, private sharedObjectService: SharedObjectService) { }

  onAddUtilisateur(addForm: NgForm): void {
    this.utilisateurService.addUtilisateur(addForm.value).subscribe({
      error: (error:HttpErrorResponse) => alert(error.message)
    } );
    this.router.navigate(['/home']);  
  }

  onConnectUtilisateur(): void {
    this.utilisateurService.loginUtilisateur(this.connect).subscribe({
      next: (response: Utilisateur) => 
        {
          if(response != null) {
            this.sharedObjectService.setSharedObjectUtilisateur(response);
            this.router.navigate(['/connected']).then(()=> {
            });
          }
          else {
            this.router.navigate(['/login']);
            
            //Creer un message avec un modal service peut etre genre cet utilisateur n'existe pas
          }
        },
      error: (error: HttpErrorResponse) => alert(error.message)
    });
  }

  public goToHome()
	{
    this.router.navigate(['/home']);
	}
}
