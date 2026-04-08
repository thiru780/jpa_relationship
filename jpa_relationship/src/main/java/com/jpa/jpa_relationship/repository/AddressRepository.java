package com.jpa.jpa_relationship.repository;

import com.jpa.jpa_relationship.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
}
