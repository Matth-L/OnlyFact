import { Component } from '@angular/core';
import { AppComponent } from '../app.component';
import { HomePageComponent } from '../home-page/home-page.component';

@Component({
  selector: 'app-post-card',
  templateUrl: './post-card.component.html',
  styleUrls: ['./post-card.component.scss']
})
export class PostCardComponent {

  valToDisplay: any;
  constructor(private homePage: HomePageComponent) { 
    this.valToDisplay = homePage.inputValues[homePage.inputValues.length - 1];
  }

}
