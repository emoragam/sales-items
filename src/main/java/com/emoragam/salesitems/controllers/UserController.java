package com.emoragam.salesitems.controllers;

import com.emoragam.salesitems.entities.User;
import com.emoragam.salesitems.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers(){
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public User createUser(@RequestBody User user) {
        repository.save(user);
        return user;
    }
}
