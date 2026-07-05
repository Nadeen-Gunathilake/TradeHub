package com.e_commerce.tradehub.service;

import com.e_commerce.tradehub.dto.CustomerRequestDto;
import com.e_commerce.tradehub.dto.CustomerResponseDto;

import java.util.List;

public interface CustomerService {
    CustomerResponseDto createCustomer(CustomerRequestDto dto);
    CustomerResponseDto updateCustomer(Long id,CustomerResponseDto dto);
    void deleteCustomer(Long id);
    List<CustomerResponseDto> getAllCustomers();
    CustomerResponseDto getCustomerById(Long id);
}
