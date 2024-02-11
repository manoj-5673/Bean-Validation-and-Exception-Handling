package com.leraning.validationexample.controller;

import com.leraning.validationexample.dto.UserRequest;
import com.leraning.validationexample.entity.User;
import com.leraning.validationexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(" ")
    public ResponseEntity saveUser(@RequestBody UserRequest userRequest){

        return new ResponseEntity<>(service.saveUser(userRequest), HttpStatus.CREATED);
    }

}
