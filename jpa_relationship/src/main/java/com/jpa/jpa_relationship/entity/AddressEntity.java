package com.jpa.jpa_relationship.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="address")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="postalCode")
    private String postalCode;

    @Column(name="country")
    private String country;

    @OneToOne(mappedBy = "addressEntity",fetch = FetchType.EAGER) // Bidirectional from child to parent
    private UserDetailEntity userDetailEntity;

}

/*

- It assigns an identifier to each object during serialization.
- When the same object appears again (e.g., in a bidirectional relationship), Jackson uses the identifier instead of serializing the full object again.
- This prevents infinite loops and keeps JSON output clean

Without @JsonIdentityInfo, serializing UserDetailEntity would endlessly expand AddressEntity → UserDetailEntity → AddressEntity → ….




 */