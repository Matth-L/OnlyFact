import { Utilisateur } from "./utilisateurs";

export interface Publication {
    id?: number;
    content: string;
    author: Utilisateur;
}

