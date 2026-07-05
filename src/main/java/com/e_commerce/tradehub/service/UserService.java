package com.e_commerce.tradehub.service;

import com.e_commerce.tradehub.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto createUser(UserResponseDto dto);
    UserResponseDto updateUser(Long id,UserResponseDto dto);
    void deleteUser(Long id);
    List<UserResponseDto> getAllUsers();
    UserResponseDto getUserById(Long id);

}
