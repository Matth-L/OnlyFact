package com.project.onlyfactdb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlyfactdb.model.Publication;
import com.project.onlyfactdb.repositories.PublicationRepository;

@Service
public class PublicationService {

    @Autowired
    private PublicationRepository publicationRepo;

    public PublicationService(PublicationRepository publicationRepo) {
        this.publicationRepo = publicationRepo;
    }

    public void addPublication(Publication publication) {
        this.publicationRepo.save(publication);
    }

    public Publication getPublicationById(long id) {
        return this.publicationRepo.findById(id).orElse(null);
    }

    public ArrayList<Publication> getAllPublication() {
        ArrayList<Publication> publications = new ArrayList<Publication>();
        Iterable<Publication> publicationsIterable = this.publicationRepo.findAll();
        publicationsIterable.forEach((pub) -> {
            publications.add(pub);
        });
        return publications;
    }

    public void deleteAllPublication() {
        this.publicationRepo.deleteAll();
    }
}
