package com.project.onlyfactdb.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlyfactdb.model.Publication;
import com.project.onlyfactdb.services.PublicationService;

@RestController
public class PublicationController {

    private PublicationService publicationService;

    public PublicationController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }

    @PostMapping("/publication")
    public void addPublication(@RequestBody Publication publication) {
        this.publicationService.addPublication(publication);
    }

    @GetMapping("/publication/{id}")
    public Publication getPublicationById(@PathVariable long id) {
        return this.publicationService.getPublicationById(id);
    }

    @GetMapping("/publications")
    public ArrayList<Publication> getAllPublications() {
        return this.publicationService.getAllPublication();
    }

    @DeleteMapping("/publications")
    public void deleteAllPublication() {
        this.publicationService.deleteAllPublication();
    }
}
