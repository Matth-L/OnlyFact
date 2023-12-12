package com.project.onlyfactdb.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlyfactdb.model.ConnexionUtilisateur;
import com.project.onlyfactdb.model.Utilisateur;
import com.project.onlyfactdb.services.UtilisateurService;

@RestController
public class UtilisateurController {

    private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService u) {
        this.utilisateurService = u;
    }

    @PostMapping("/utilisateur")
    public void ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {
        utilisateurService.ajouterUtilisateur(utilisateur);
    }

    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable Long id) {
        return utilisateurService.getUtilisateur(id);
    }
    
    @PutMapping("/utilisateur")
    public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.updateUtilisateur(utilisateur);
    }
    
    @DeleteMapping("/utilisateur/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteUtilisateur(id);
    }

    @GetMapping("/utilisateurs")
    public ArrayList<Utilisateur> getAllUtilisateurs() {
        return utilisateurService.getAllUtilisateur();
    }

    @PostMapping("/utilisateur/login")
    public Utilisateur loginUtilisateur(@RequestBody ConnexionUtilisateur cu) {
        return utilisateurService.loginUtilisateur(cu.getMail(), cu.getMotDePasse());
    }

    @GetMapping("/utilisateur/byMail/{mail}")
    public Utilisateur getUtilisateurByMail(@PathVariable String mail) {
       return utilisateurService.getUtilisateurByMail(mail);
    }
}
