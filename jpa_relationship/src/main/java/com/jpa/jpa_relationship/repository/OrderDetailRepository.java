package com.jpa.jpa_relationship.repository;

import com.jpa.jpa_relationship.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetails,Long> {
}
