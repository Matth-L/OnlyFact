import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Utilisateur } from "../models/utilisateurs";
import { HttpClient } from "@angular/common/http";
import { NgForm } from "@angular/forms";
import { ICredentials } from "../models/credentials";

@Injectable( {
    providedIn: 'root'
})
export class UtilisateurService {
    private apiServeUrl = 'http://localhost:8080';

    public utilisateurs: Utilisateur[] = [];
    
    constructor(private http: HttpClient) { }

    public getUtilisateurs(): Observable<Utilisateur[]> {
        return this.http.get<Utilisateur[]>(`${this.apiServeUrl}/utilisateurs`)
    }

    public addUtilisateur(utilisateur: Utilisateur): Observable<Utilisateur> {
        return this.http.post<Utilisateur>(`${this.apiServeUrl}/utilisateur`, utilisateur);
    } 
    
    public loginUtilisateur(credentials: ICredentials): Observable<Utilisateur> {
        return this.http.post<Utilisateur>(`${this.apiServeUrl}/utilisateur/login`, credentials);
    }

    public getUtilisateurByMail(mail: string): Observable<Utilisateur> {
        return this.http.get<Utilisateur>(`${this.apiServeUrl}/utilisateur/${mail}`);
    }
}

