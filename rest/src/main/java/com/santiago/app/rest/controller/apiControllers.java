package com.santiago.app.rest.controller;

import com.santiago.app.rest.Models.Users;
import com.santiago.app.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class apiControllers {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(value = "prueba")
    public String prueba() {
        return "Hola mundo";
    }

    @GetMapping(value="/users")
    public List<Users> getUsers(){
        return userRepo.findAll();
    }

    @GetMapping(value="/users/{id}")
    public Optional<Users> getUserById(@PathVariable long id){
        return userRepo.findById(id);
    }

    @PostMapping(value = "/users")
    public String postUsers(@RequestBody Users user) {
        userRepo.save(user);
        return "user saved";
    }
}
