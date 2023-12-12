import { Injectable } from "@angular/core";
import { Utilisateur } from "../models/utilisateurs";

@Injectable({
    providedIn: 'root' 
})
export class SharedObjectService {
    private utilisateur: Utilisateur | undefined;

    setSharedObjectUtilisateur(utilisateur : Utilisateur) {
        this.utilisateur = utilisateur;
    }

    getSharedObjectUtilisateur() {
        return this.utilisateur
    }
}