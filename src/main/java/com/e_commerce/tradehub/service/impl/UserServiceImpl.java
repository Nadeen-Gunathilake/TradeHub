package com.e_commerce.tradehub.service.impl;

import com.e_commerce.tradehub.dto.UserRequestDto;
import com.e_commerce.tradehub.dto.UserResponseDto;
import com.e_commerce.tradehub.mapper.UserMapper;
import com.e_commerce.tradehub.model.User;
import com.e_commerce.tradehub.repository.UserRepository;
import com.e_commerce.tradehub.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public UserResponseDto updateUser(Long id, UserRequestDto dto){
        User existing = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        existing.setName(dto.getName());
        existing.setUserName(dto.getUserName());

        return userMapper.toResponseDto(userRepository.save(existing));
    }

    @Override
    public void deleteUser(Long id){
        userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id:"+id));
        userRepository.deleteById(id);
    }

    @Override
    public List<UserResponseDto> getAllUsers(){
        return userRepository.findAll().stream()
                .map(userMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDto getUserById(Long id){
        User user=userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id :"+id));
        return userMapper.toResponseDto(user);
    }
}
