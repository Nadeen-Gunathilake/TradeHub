package com.e_commerce.tradehub.service;

import com.e_commerce.tradehub.dto.UserRequestDto;
import com.e_commerce.tradehub.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto updateUser(Long id, UserRequestDto dto);
    void deleteUser(Long id);
    List<UserResponseDto> getAllUsers();
    UserResponseDto getUserById(Long id);

}
