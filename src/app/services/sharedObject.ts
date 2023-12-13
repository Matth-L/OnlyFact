import { Injectable } from "@angular/core";
import { Utilisateur } from "../models/utilisateurs";

@Injectable({
    providedIn: 'root' 
})
export class SharedObjectService {
    private storageKey = 'userCo';

    setSharedObjectUtilisateur(utilisateur : Utilisateur): void {
        localStorage.setItem(this.storageKey, JSON.stringify(utilisateur));
    }

    getSharedObjectUtilisateur(): Utilisateur | null {
        const utilisateurString = localStorage.getItem(this.storageKey);
        return utilisateurString ? JSON.parse(utilisateurString) : null;
    }
}