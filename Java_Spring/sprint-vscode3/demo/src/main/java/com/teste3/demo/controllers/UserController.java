package com.teste3.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste3.demo.entities.User;
import com.teste3.demo.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping // requisição html ele pede isto < ja configurado.
    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }

}
