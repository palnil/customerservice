package com.yoshallc.customerservice.repositories;

import com.yoshallc.customerservice.dtos.Customer;
import com.yoshallc.customerservice.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

}
