package com.project.onlyfactdb.model;

import org.hibernate.annotations.CollectionId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
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
     
}
