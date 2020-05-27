package com.yoshallc.customerapi.repositories;

import com.yoshallc.customerapi.entities.AddressEntity;
import com.yoshallc.customerapi.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
}
