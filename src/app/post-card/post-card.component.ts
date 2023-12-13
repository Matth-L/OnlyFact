import { Component, ViewEncapsulation } from '@angular/core';
import { AppComponent } from '../app.component';
import { HomePageComponent } from '../home-page/home-page.component';
import { Publication } from '../models/publications';
import { HttpErrorResponse } from '@angular/common/http';
import { PublicationService } from '../services/publication.service';

@Component({
  selector: 'app-post-card',
  templateUrl: './post-card.component.html',
  styleUrls: ['./post-card.component.scss'],
})
export class PostCardComponent {

  public publications: Publication[] = [];

  constructor(private publicationService: PublicationService) { 
  }

  ngOnInit() {
    this.getPublications();
  }

  public getPublications(): void {
    this.publicationService.getPublications().subscribe(
        {
          next: (response: Publication[]) => this.publications = response,
          error: (error: HttpErrorResponse) => alert(error.message)
        }
    )
  }
}
