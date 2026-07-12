package com.e_commerce.tradehub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name="customers")

public class Customer extends User{

    @NotBlank(message = "Shipping Address Required")
    private String shippingAddress;
}
