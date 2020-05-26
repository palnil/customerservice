package com.yoshallc.customerservice.controllers;

import com.yoshallc.customerservice.entities.CustomerEntity;
import com.yoshallc.customerservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("customers")
    public Iterable<CustomerEntity> getAllCustomers(){
     return customerService.getAllCustomers();
    }

}
