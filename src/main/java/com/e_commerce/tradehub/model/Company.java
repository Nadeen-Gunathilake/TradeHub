package com.e_commerce.tradehub.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "companies")
public class Company extends User{

    private String address;
    private String bankAccountNumber;
    private String accHolderName;
    private String bankName;


}
