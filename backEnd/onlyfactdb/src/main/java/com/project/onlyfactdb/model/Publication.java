package com.project.onlyfactdb.model;

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
    
    @Column(name= "content")
    private String content;
    
    @ManyToOne
    @JoinColumn(name="id_utilisateur")
    private Utilisateur author;

    //Constructeur
    public Publication(String content, Utilisateur author) {
        this.content = content;
        this.author = author;
    }

    //getter
    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public Utilisateur getAuthor() {
        return this.author;
    }

    //setter

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(Utilisateur utilisateur) {
        this.author = utilisateur;
    }
     
}
