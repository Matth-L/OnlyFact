package com.project.onlyfactdb.model;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.internal.lang.annotation.ajcPrivileged;
import org.hibernate.engine.internal.Cascade;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="utilisateurs")
@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_utilisateur")
    private Long id;
    
    private String nom;
    private String prenom;
    private String pseudo;

    @Column(unique = true)
    private String mail;

    private String adressePhysique;
    private String motDePasse;
    private boolean isAdmin;
    private boolean isBanned;

    //Attributs d'associations
    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_utilisateur_id", referencedColumnName = "id_utilisateur")
   // private List<Publication> publications;

    //Constructeur
    public Utilisateur(String nom, String prenom, String pseudo, String mail, String adressePhysique, String motDePasse, boolean isAdmin, boolean isBanned) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.pseudo = pseudo;
        this.adressePhysique = adressePhysique;
        this.motDePasse = motDePasse;
        this.isAdmin = isAdmin;
        this.isBanned = isBanned;
    }

    //getters
    public Long getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public String getMail() {
        return this.mail;
    }

    public String getAdressePhysique() {
        return this.adressePhysique;
    }

    public String getMotDePasse() {
        return this.motDePasse;
    }
    public boolean getIsAdmin() {
        return this.isAdmin;
    }
    public boolean getIsBanned() {
        return this.isBanned;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAdressePhysique(String adressePhysique) {
        this.adressePhysique = adressePhysique;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    } 

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setIsBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }
}
