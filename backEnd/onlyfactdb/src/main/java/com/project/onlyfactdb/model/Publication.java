package com.project.onlyfactdb.model;

import org.hibernate.annotations.CollectionId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "publications")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name= "id_publication")
    private long id;

    @Column(name= "title")
    private String title;
    
    @Column(name= "content")
    private String content;
    
    @ManyToOne
    @JoinColumn(name="id_utilisateur")
    private Utilisateur author;

    //Constructeur
    public Publication(String title, String content, Utilisateur author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //getter
    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public Utilisateur getUtilisateur() {
        return this.author;
    }

    //setter

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.author = utilisateur;
    }
     
}
