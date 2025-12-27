package com.project.fitness.controller;

import com.project.fitness.service.UserService;
import lombok.RequiredArgsConstructor;
import com.project.fitness.model.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

//    public AuthController(UserService userService) {
//        this.userService = userService;
//    }

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }
}
