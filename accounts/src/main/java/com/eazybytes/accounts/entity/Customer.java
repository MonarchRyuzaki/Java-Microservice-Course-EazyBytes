package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
// @Table(name = "XYZ") => Maps XYZ in db to customer
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
