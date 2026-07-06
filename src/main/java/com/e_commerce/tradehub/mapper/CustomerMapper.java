package com.e_commerce.tradehub.mapper;

import com.e_commerce.tradehub.dto.CustomerRequestDto;
import com.e_commerce.tradehub.dto.CustomerResponseDto;
import com.e_commerce.tradehub.dto.UserResponseDto;
import com.e_commerce.tradehub.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerMapper {

    private final UserMapper userMapper;

    public Customer toEntity(CustomerRequestDto dto){
        Customer entity = new Customer();
        entity.setName(dto.getUserRequestDto().getName());
        entity.setUserName(dto.getUserRequestDto().getUserName());
        entity.setPassword(dto.getUserRequestDto().getPassword());
        entity.setShippingAddress(dto.getShippingAddress());
        return entity;
    }

    public CustomerResponseDto toResponseDto(Customer entity){

        CustomerResponseDto dto = new CustomerResponseDto();
        dto.setShippingAddress(entity.getShippingAddress());
        dto.setUserResponseDto(userMapper.toResponseDto(entity));

        return dto;

    }

}
