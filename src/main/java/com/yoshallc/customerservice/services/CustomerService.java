package com.yoshallc.customerservice.services;

import com.yoshallc.customerservice.entities.CustomerEntity;
import com.yoshallc.customerservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Iterable<CustomerEntity> getAllCustomers(){

        return  customerRepository.findAll();

    }
}
