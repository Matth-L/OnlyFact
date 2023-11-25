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

    //Attributs d'associations
    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_utilisateur_id", referencedColumnName = "id_utilisateur")
   // private List<Publication> publications;

    //Constructeur
    public Utilisateur(String nom, String prenom, String pseudo, String mail, String adressePhysique, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.pseudo = pseudo;
        this.adressePhysique = adressePhysique;
        this.motDePasse = motDePasse;
    }

    //getter 
    
    //setter
    
}
