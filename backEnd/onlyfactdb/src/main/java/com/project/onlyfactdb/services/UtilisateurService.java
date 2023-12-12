package com.project.onlyfactdb.services;

import java.util.ArrayList;
import java.util.Optional;

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

    public Utilisateur getUtilisateur(Long id) {
        Optional<Utilisateur> utilisateur = utilisateurRepo.findById(id);
        if (utilisateur.isPresent()) {
            return utilisateur.get();
        } else {
            throw new RuntimeException("Utilisateur not found for id: " + id);
        }
    }
    
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        if (utilisateurRepo.existsById(utilisateur.getId())) { //On doit ajouter l'id dans le RequestBody
            return utilisateurRepo.save(utilisateur);
        } else {
            throw new RuntimeException("Utilisateur not found for id: " + utilisateur.getId());
        }
    }
    
    public void deleteUtilisateur(Long id) {
        if (utilisateurRepo.existsById(id)) {
            utilisateurRepo.deleteById(id);
        } else {
            throw new RuntimeException("Utilisateur not found for id: " + id);
        }
    }

    public ArrayList<Utilisateur> getAllUtilisateur() {
        ArrayList<Utilisateur> utilsateurs = new ArrayList<Utilisateur>();
        Iterable<Utilisateur> utilisateursIterable = utilisateurRepo.findAll();
        utilisateursIterable.forEach((user) -> {
            utilsateurs.add(user);
        });
        return utilsateurs;
    }
    
    public Utilisateur loginUtilisateur(String mail, String motDePasse) {
        Utilisateur u = getUtilisateurByMail(mail);
        if(u != null && u.getMotDePasse().equals(motDePasse)) {
            return u;
        }
        else {
            return null;
        }
    }
    
    public Utilisateur getUtilisateurByMail(String mail) {
        return this.utilisateurRepo.getUtilisateurByMail(mail);
    }

}
