package com.yoshallc.customerapi.services;

import com.yoshallc.customerapi.entities.CustomerEntity;
import com.yoshallc.customerapi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Iterable<CustomerEntity> getAllCustomers() {

        // TODO : add logic here to convert M to Male and return Iterable<CustomerEntity> to controller.
        return customerRepository.findAll();
    }
}
