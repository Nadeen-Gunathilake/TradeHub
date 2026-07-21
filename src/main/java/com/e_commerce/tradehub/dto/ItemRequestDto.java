package com.e_commerce.tradehub.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ItemRequestDto {
    @NotBlank(message = "Item name is required")
    private String name;

    @Positive(message = "Price must be greater than zero")
    private double price;

    @PositiveOrZero
    private double shippingWeight;

    @Min(0)
    private int quantityInStock;
}