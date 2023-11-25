package com.project.onlyfactdb.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlyfactdb.model.User;
import com.project.onlyfactdb.services.UtilisateurService;

@RestController
public class UtilisateurController {
    
    private UtilisateurService userService;

    public UtilisateurController(UtilisateurService userService) {
        this.userService = userService;
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/utilisateur")
    public void addUser(@RequestBody User user) {
       userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/utilisateur/{id}")
    public User getUser(@PathVariable long id) {
       return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/utilisateur/{id}")
    public void removeUser(@PathVariable long id) {
        userService.removeUser(id);
    }
}
