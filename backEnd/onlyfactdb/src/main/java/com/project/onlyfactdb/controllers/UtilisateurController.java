package com.project.onlyfactdb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable Long id) {
        return utilisateurService.getUtilisateur(id);
    }
    
    @PostMapping("/utilisateur")
    public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.updateUtilisateur(utilisateur);
    }
    
    @DeleteMapping("/utilisateur/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteUtilisateur(id);
    }
}
