import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { SharedObjectService } from '../services/sharedObject';

@Component({
  selector: 'app-topbar-connected',
  templateUrl: './topbar-connected.component.html',
  styleUrls: ['./topbar-connected.component.scss']
})
export class TopbarConnectedComponent {

  constructor(private router: Router, private sharedObjectService: SharedObjectService) { }

  public goToHomePage(): void {
    this.router.navigate(['/home']);
  }

}
