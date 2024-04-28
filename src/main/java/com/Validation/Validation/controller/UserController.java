package com.Validation.Validation.controller;

import com.Validation.Validation.entity.UserDetails;
import com.Validation.Validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save-user")
    public String saveUser(@Valid @RequestBody UserDetails user){
        userService.saveUser(user);
        return "user saved";
    }
}
