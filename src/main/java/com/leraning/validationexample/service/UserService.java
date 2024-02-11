package com.leraning.validationexample.service;

import com.leraning.validationexample.dto.UserRequest;
import com.leraning.validationexample.entity.User;
import com.leraning.validationexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {

        User user = User.
                build();

        return userRepository.save(user);
    }

}