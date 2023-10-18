import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [

  // Autres routes
  { path: '', redirectTo: '/home', pathMatch: 'full' }, // Rediriger vers la page d'accueil par défaut
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
