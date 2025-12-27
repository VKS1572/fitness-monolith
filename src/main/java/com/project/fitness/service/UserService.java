package com.project.fitness.service;

import com.project.fitness.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import com.project.fitness.model.User;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {


        private final UserRepository userRepository;

        public User register (User user){
           return userRepository.save(user);
        }
}

