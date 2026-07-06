package com.e_commerce.tradehub.mapper;

import com.e_commerce.tradehub.dto.CustomerRequestDto;
import com.e_commerce.tradehub.dto.CustomerResponseDto;
import com.e_commerce.tradehub.dto.UserResponseDto;
import com.e_commerce.tradehub.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer toEntity(CustomerRequestDto dto){
        Customer entity = new Customer();
        entity.setName(dto.getUserRequestDto().getName());
        entity.setUserName(dto.getUserRequestDto().getUserName());
        entity.setPassword(dto.getUserRequestDto().getPassword());
        entity.setShippingAddress(dto.getShippingAddress());
        return entity;
    }

    public CustomerResponseDto toResponseDto(Customer entity){
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setRegistrationNumber(entity.getRegistrationNumber());
        userResponseDto.setName(entity.getName());
        userResponseDto.setUserName(entity.getUserName());

        CustomerResponseDto dto = new CustomerResponseDto();
        dto.setShippingAddress(entity.getShippingAddress());
        dto.setUserResponseDto(userResponseDto);

        return dto;

    }

}
