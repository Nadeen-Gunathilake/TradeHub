package com.e_commerce.tradehub.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@Table(name="users")
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*userName-AccountName
    name-Company/Customer Name
    */
    private String userName;
    private String name;
    private String password;
    private String registrationNumber;


}
