package com.e_commerce.tradehub.mapper;

import com.e_commerce.tradehub.dto.CompanyRequestDto;
import com.e_commerce.tradehub.dto.CompanyResponseDto;
import com.e_commerce.tradehub.dto.UserResponseDto;
import com.e_commerce.tradehub.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CompanyMapper {

    private final UserMapper userMapper;

    public Company toEntity(CompanyRequestDto dto){
        Company entity=new Company();
        entity.setName(dto.getUserRequestDto().getName());
        entity.setUserName(dto.getUserRequestDto().getUserName());
        entity.setPassword(dto.getUserRequestDto().getPassword());
        entity.setAddress(dto.getAddress());
        entity.setBankName(dto.getBankName());
        entity.setAccHolderName(dto.getAccHolderName());
        entity.setBankAccountNumber(dto.getBankAccountNumber());

        return entity;
    }

    public CompanyResponseDto toResponseDto(Company entity){

        CompanyResponseDto dto=new CompanyResponseDto();
        dto.setAddress(entity.getAddress());
        dto.setUserResponseDto(userMapper.toResponseDto(entity));

        return dto;
    }
}
