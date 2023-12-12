import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Publication } from "../models/publications";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root' 
})
export class PublicationService {
    private apiServeUrl = 'http://localhost:8080';

    constructor(private http: HttpClient) { }

    public getPublications(): Observable<Publication[]> {
        return this.http.get<Publication[]>(`${this.apiServeUrl}/publications`)
    }

    public addPublication(publication: Publication): Observable<Publication> {
        console.log(publication);
        return this.http.post<Publication>(`${this.apiServeUrl}/publication`, publication);
    }
}