import { Component } from '@angular/core';
import { PublicationService } from '../services/publication.service';
import { Publication } from '../models/publications';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { UtilisateurService } from '../services/utilisateur.service';
import { Utilisateur } from '../models/utilisateurs';
import { SharedObjectService } from '../services/sharedObject';

@Component({
  selector: 'app-home-page-connected',
  templateUrl: './home-page-connected.component.html',
  styleUrls: ['./home-page-connected.component.scss']
})
export class HomePageConnectedComponent {

  title = 'OnlyFact';
  
  addPub: Publication = {
    content: "",
    author: {
      nom: '',
      mail: '',
      motDePasse: ''
    }
  }

  constructor(private publicationService: PublicationService, private sharedObjectService: SharedObjectService) {
  }

  ngOnInit() {
    this.addPub.author = this.sharedObjectService.getSharedObjectUtilisateur()!;
  }

  public onSubmitPublication(): void {
    this.publicationService.addPublication(this.addPub).subscribe({
      next: (response: Publication) => {
        this.publicationService.addPublication(response);
        this.addPub.content = '';
      },
      error: (error: HttpErrorResponse) => {
        alert(error.message);
      }});
  }
}
