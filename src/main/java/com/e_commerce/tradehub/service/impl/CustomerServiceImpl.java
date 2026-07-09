package com.e_commerce.tradehub.service.impl;

import com.e_commerce.tradehub.dto.CustomerRequestDto;
import com.e_commerce.tradehub.dto.CustomerResponseDto;
import com.e_commerce.tradehub.mapper.CustomerMapper;
import com.e_commerce.tradehub.model.Customer;
import com.e_commerce.tradehub.repository.CustomerRepository;
import com.e_commerce.tradehub.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;

    }

    @Override
    public CustomerResponseDto createCustomer(CustomerRequestDto dto){
        Customer customer = customerMapper.toEntity(dto);
        return customerMapper.toResponseDto(customerRepository.save(customer));
    }

    @Override
    public CustomerResponseDto updateCustomer(Long id,CustomerRequestDto dto){
        Customer existing = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: "+id));
        existing.setName(dto.getUserRequestDto().getName());
        existing.setUserName(dto.getUserRequestDto().getUserName());
        existing.setShippingAddress(dto.getShippingAddress());

        return customerMapper.toResponseDto(customerRepository.save(existing));
    }

    @Override
    public void deleteCustomer(Long id){
        customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: "+ id));
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerResponseDto> getAllCustomers(){
        return customerRepository.findAll().stream()
                .map(customerMapper::toResponseDto)
                .collect(Collectors.toList());
    }
    public CustomerResponseDto getCustomerById(Long id){
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " +id));
        return customerMapper.toResponseDto(customer);
    }
}
