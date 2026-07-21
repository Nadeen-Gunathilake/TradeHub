package com.e_commerce.tradehub.model;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Data
@Table(name="items")
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private double price;

    @Column(name = "shipping_weight")
    private double shippingWeight;

    @Column(name="quantity_in_stock")
    private int quantityInStock;
}
