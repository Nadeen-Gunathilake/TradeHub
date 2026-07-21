package com.e_commerce.tradehub.dto;

import lombok.Data;

@Data
public class ItemResponseDto {
    private Long id;
    private String name;
    private double price;
    private double shippingWeight;
    private int quantityInStock;
}