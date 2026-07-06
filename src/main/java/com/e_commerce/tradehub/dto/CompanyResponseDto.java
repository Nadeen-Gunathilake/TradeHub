package com.e_commerce.tradehub.dto;

import lombok.Data;

@Data
public class CompanyResponseDto {
    private UserResponseDto userResponseDto;
    private String address;
}
