package com.project.onlyfactdb.model;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.internal.lang.annotation.ajcPrivileged;
import org.hibernate.engine.internal.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @Column(unique = true)
    private String mail;

    private String motDePasse;
    private boolean isAdmin;
    private boolean isBanned;

    //Attributs d'associations
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    @JsonIgnore
    private List<Publication> publications;

    //Constructeur
    public Utilisateur(String nom, String mail, String motDePasse) {
        this.nom = nom;
        this.mail = mail;
        this.motDePasse = motDePasse;
        this.isAdmin = false;
        this.isBanned = false;
        this.publications = new ArrayList<Publication>();
    }

    //getters
    public Long getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getMail() {
        return this.mail;
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

    public List<Publication> gePublication() {
        return this.publications;
    }

    //setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    //Autres Fonctions
    public void addPublicationList(Publication publication) {
        this.publications.add(publication);
    }
}
