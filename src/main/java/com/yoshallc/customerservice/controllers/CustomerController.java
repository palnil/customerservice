package com.yoshallc.customerservice.controllers;

import com.yoshallc.customerservice.dtos.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("/")
public class CustomerController {

    @GetMapping("customers")
    public List<Customer> getAllCustomers(){

     return  Arrays.asList(new Customer(1L,"Nilesh", "Patel","M"),
                    new Customer(2L,"Jay","Patel", "M"));

    }

}
