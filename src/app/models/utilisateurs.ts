import { Publication } from "./publications";

export interface Utilisateur {
    id?: number;
    nom: string;
    mail: string; 
    motDePasse: string;
    isBanned?: boolean;
    isAdmin?: boolean;
    lesPublications?: Publication[];
}