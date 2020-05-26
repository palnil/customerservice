package com.yoshallc.customerapi.services;

import com.yoshallc.customerapi.dtos.Customer;
import com.yoshallc.customerapi.entities.CustomerEntity;
import com.yoshallc.customerapi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;



    public Iterable<CustomerEntity> getAllCustomers(){

        return  customerRepository.findAll();

    }

    public Customer UserWithFullSex(Customer customer){

        String sex = customer.getSex().toUpperCase().equals("M") ? "Male" : "Female";
        return new Customer(customer.getId(),customer.getFirstName(),customer.getLastName(),sex);

    }
}
