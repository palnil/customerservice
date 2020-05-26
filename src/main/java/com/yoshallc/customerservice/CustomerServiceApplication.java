package com.yoshallc.customerservice;

import com.yoshallc.customerservice.dtos.Customer;
import com.yoshallc.customerservice.entities.CustomerEntity;
import com.yoshallc.customerservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner laodInitialData(CustomerRepository customerRepository) {
        return args -> {
            List<CustomerEntity> customers = Arrays.asList(
                    new CustomerEntity("John", "Smith", "M"),
                    new CustomerEntity("David", "Freeman", "M"),
                    new CustomerEntity("Vanesa", "Brooks", "M"));
            customers.forEach(customer -> customerRepository.save(customer));
        };
    }
}