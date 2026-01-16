package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
// @Table(name = "XYZ") => Maps XYZ in db to customer
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class Accounts extends BaseEntity {

    @Id
    private Long accountNumber;

    private String accountType;

    private String branchAddress;


    private Long customerId;
}
