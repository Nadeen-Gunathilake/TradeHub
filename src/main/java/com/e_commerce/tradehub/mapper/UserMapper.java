package com.e_commerce.tradehub.mapper;

import com.e_commerce.tradehub.dto.UserResponseDto;
import com.e_commerce.tradehub.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserResponseDto toResponseDto(User entity) {
        UserResponseDto dto = new UserResponseDto();
        dto.setUserName(entity.getUserName());
        dto.setName(entity.getName());
        dto.setRegistrationNumber(entity.getRegistrationNumber());
        return dto;
    }
}