package com.yoshallc.customerapi.controllers;

import com.yoshallc.customerapi.entities.CustomerEntity;
import com.yoshallc.customerapi.services.CustomerService;
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
