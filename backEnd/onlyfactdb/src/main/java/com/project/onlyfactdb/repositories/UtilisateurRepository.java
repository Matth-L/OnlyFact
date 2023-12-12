package com.project.onlyfactdb.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.onlyfactdb.model.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

    Utilisateur getUtilisateurByMail(String mail);
}
