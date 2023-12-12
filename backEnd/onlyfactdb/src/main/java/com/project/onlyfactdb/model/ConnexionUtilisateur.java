package com.project.onlyfactdb.model;

public class ConnexionUtilisateur {
    private String mail;
    private String motDePasse;

    public ConnexionUtilisateur(String mail, String motDePasse) {
        this.mail = mail;
        this.motDePasse = motDePasse;
    }

    public String getMail() {
        return this.mail;
    }

    public String getMotDePasse() {
        return this.motDePasse;
    }
}
