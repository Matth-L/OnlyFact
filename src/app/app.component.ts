import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Utilisateur } from './models/utilisateurs';
import { UtilisateurService } from './services/utilisateur.service';
import { HttpErrorResponse } from '@angular/common/http';
import { PublicationService } from './services/publication.service';
import { Publication } from './models/publications';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
}
