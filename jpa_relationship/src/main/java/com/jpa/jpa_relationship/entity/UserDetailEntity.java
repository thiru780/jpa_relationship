package com.jpa.jpa_relationship.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user_details")
public class UserDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="user_name")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id", referencedColumnName = "id")
    private AddressEntity addressEntity;





}
