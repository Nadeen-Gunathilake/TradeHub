package com.e_commerce.tradehub.dto;

import lombok.Data;

@Data
public class CompanyRequestDto {
    private UserRequestDto userRequestDto;
    private String address;
    private String bankAccountNumber;
    private String accHolderName;
    private String bankName;
}
