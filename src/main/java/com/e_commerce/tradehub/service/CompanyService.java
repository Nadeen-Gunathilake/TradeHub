package com.e_commerce.tradehub.service;

import com.e_commerce.tradehub.dto.CompanyRequestDto;
import com.e_commerce.tradehub.dto.CompanyResponseDto;

import java.util.List;

public interface CompanyService {
    CompanyResponseDto createCompany(CompanyRequestDto dto);
    CompanyResponseDto updateCompany(Long id,CompanyRequestDto dto);
    void deleteCompany(Long id);
    List<CompanyResponseDto> getAllCompanies();
    CompanyResponseDto getCompanyById(Long id);
}
