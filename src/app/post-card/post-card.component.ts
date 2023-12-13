import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { AppComponent } from '../app.component';
import { HomePageComponent } from '../home-page/home-page.component';
import { Publication } from '../models/publications';
import { HttpErrorResponse } from '@angular/common/http';
import { PublicationService } from '../services/publication.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-post-card',
  templateUrl: './post-card.component.html',
  styleUrls: ['./post-card.component.scss'],
  encapsulation: ViewEncapsulation.None
})
export class PostCardComponent {

  publications$: Observable<Publication[]> = this.publicationService.getPublications();

  constructor(private publicationService: PublicationService) { 
  }
}
