package com.project.onlyfactdb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlyfactdb.model.User;
import com.project.onlyfactdb.repositories.UserRepository;

@Service
public class UtilisateurService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUser(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void removeUser(long id) {
        userRepository.deleteById(id);
    }
}
