package com.e_commerce.tradehub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "companies")
public class Company extends User{

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Bank Account is required")
    private String bankAccountNumber;

    @NotBlank(message = "Account Holder is required")
    private String accHolderName;

    @NotBlank(message = "Bank Name is required")
    private String bankName;


}
