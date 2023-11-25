package com.project.onlyfactdb.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlyfactdb.model.Utilisateur;
import com.project.onlyfactdb.services.UtilisateurService;

@RestController
public class UtilisateurController {

    private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService u) {
        this.utilisateurService = u;
    }

    @PutMapping("/utilisateur")
    public void ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {
        utilisateurService.ajouterUtilisateur(utilisateur);
    }
}
