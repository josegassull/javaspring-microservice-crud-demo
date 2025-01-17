package com.crud_example.app.service;

import com.crud_example.app.dto.request.CustomerRequestDto;
import com.crud_example.app.dto.response.CustomerResponseDto;
import com.crud_example.core.entity.CustomerEntity;
import java.util.List;
import java.util.UUID;

public interface CustomerService {

    CustomerResponseDto createCustomer(CustomerRequestDto customer);

    CustomerResponseDto getCustomerById(UUID customerId);

    CustomerResponseDto updateCustomer(UUID customerId, CustomerRequestDto customerRequestDto);

    void deleteCustomer(UUID customerId);
}