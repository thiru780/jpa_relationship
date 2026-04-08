package com.jpa.jpa_relationship.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class UserEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name="name")
        private String name;


        @Column(name="phone_number")
        private String phoneNumber;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name="user_fk_id", referencedColumnName = "id")
        private List<OrderDetails> orderDetails;
}
