package com.jpa.jpa_relationship.controller;

import com.jpa.jpa_relationship.entity.UserDetailEntity;
import com.jpa.jpa_relationship.entity.UserEntity;
import com.jpa.jpa_relationship.repository.UserEnityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value="/api")
public class Controller {



        @Autowired
        private UserEnityRepository userEnityRepository;


        @PostMapping("/adduser")
        public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity){

            UserEntity userDetail = userEnityRepository.save(userEntity);

            return ResponseEntity.status(HttpStatus.CREATED).body(userDetail);

        }


    @GetMapping("{id}")
    public Optional<UserEntity> fetchUser(@PathVariable Long id){

        return userEnityRepository.findById(id);

    }

    }
