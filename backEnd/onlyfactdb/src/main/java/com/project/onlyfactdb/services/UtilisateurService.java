package com.project.onlyfactdb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlyfactdb.model.Utilisateur;
import com.project.onlyfactdb.repositories.UtilisateurRepository;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepo;

    public UtilisateurService(UtilisateurRepository r) {
        this.utilisateurRepo = r;
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurRepo.save(utilisateur);
    }

}
