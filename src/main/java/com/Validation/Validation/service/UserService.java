package com.Validation.Validation.service;

import com.Validation.Validation.UserRepository.UserRepository;
import com.Validation.Validation.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserDetails user) {
        userRepository.save(user);
    }
}
