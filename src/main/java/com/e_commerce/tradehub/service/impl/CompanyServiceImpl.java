package com.e_commerce.tradehub.service.impl;

import com.e_commerce.tradehub.dto.CompanyRequestDto;
import com.e_commerce.tradehub.dto.CompanyResponseDto;
import com.e_commerce.tradehub.mapper.CompanyMapper;
import com.e_commerce.tradehub.model.Company;
import com.e_commerce.tradehub.repository.CompanyRepository;
import com.e_commerce.tradehub.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    public CompanyServiceImpl(CompanyRepository companyRepository, CompanyMapper companyMapper) {
        this.companyRepository = companyRepository;
        this.companyMapper = companyMapper;

    }

    @Override
    public CompanyResponseDto createCompany(CompanyRequestDto dto){
        Company company = companyMapper.toEntity(dto);
        return companyMapper.toResponseDto(companyRepository.save(company));
    }

    @Override
    public CompanyResponseDto updateCompany(Long id,CompanyRequestDto dto){
        Company existing = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found with id: "+id));
        existing.setName(dto.getUserRequestDto().getName());
        existing.setUserName(dto.getUserRequestDto().getUserName());
        existing.setAddress(dto.getAddress());
        existing.setBankName(dto.getBankName());
        existing.setAccHolderName(dto.getAccHolderName());
        existing.setBankAccountNumber(dto.getBankAccountNumber());

        return companyMapper.toResponseDto(companyRepository.save(existing));
    }

    @Override
    public void deleteCompany(Long id){
        companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found with id: "+ id));
        companyRepository.deleteById(id);
    }

    @Override
    public List<CompanyResponseDto> getAllCompanies(){
        return companyRepository.findAll().stream()
                .map(companyMapper::toResponseDto)
                .collect(Collectors.toList());
    }
    public CompanyResponseDto getCompanyById(Long id){
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found with id: " +id));
        return companyMapper.toResponseDto(company);
    }
}
