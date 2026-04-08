package com.jpa.jpa_relationship.repository;


import com.jpa.jpa_relationship.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEnityRepository extends JpaRepository<UserEntity,Long> {


}
