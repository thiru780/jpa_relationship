package com.jpa.jpa_relationship.repository;

import com.jpa.jpa_relationship.entity.UserDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetailEntity,Long> {


}
