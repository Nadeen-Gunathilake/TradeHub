package com.e_commerce.tradehub.dto;

import lombok.Data;

@Data
public class CustomerRequestDto {
    private UserRequestDto userRequestDto;
    private String shippingAddress;
}
