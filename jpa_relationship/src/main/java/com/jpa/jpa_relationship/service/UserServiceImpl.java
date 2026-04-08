package com.jpa.jpa_relationship.service;

import com.jpa.jpa_relationship.entity.UserDetailEntity;
import com.jpa.jpa_relationship.exception.ResourceAlreadyExistsException;
import com.jpa.jpa_relationship.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetailEntity createUser(UserDetailEntity userDetailEntity) {
//        Optional<UserDetailEntity> existingUser = userRepository.findById(userDetailEntity.getId());
//
//        if (existingUser.isPresent()) {
//            // User already exists → throw exception
//            throw new ResourceAlreadyExistsException("User with ID " + userDetailEntity.getId() + " already exists");
//        }

        // User does not exist → save and return
        return userRepository.save(userDetailEntity);


    }

}