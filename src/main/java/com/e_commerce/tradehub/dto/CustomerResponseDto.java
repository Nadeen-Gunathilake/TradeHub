package com.e_commerce.tradehub.dto;

import lombok.Data;

@Data
public class CustomerResponseDto {
    private UserResponseDto userResponseDto;
    private String shippingAddress;
}
