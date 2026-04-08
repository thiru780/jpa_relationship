package com.jpa.jpa_relationship.controller;

import com.jpa.jpa_relationship.entity.UserDetailEntity;
import com.jpa.jpa_relationship.service.UserService;
import com.jpa.jpa_relationship.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;


    @PostMapping("/addUser")
    public ResponseEntity<UserDetailEntity> createUser(@RequestBody UserDetailEntity userDetailEntity){

        UserDetailEntity userDetail =userServiceImpl.createUser(userDetailEntity);

        return ResponseEntity.status(HttpStatus.CREATED).body(userDetail);

    }


}
