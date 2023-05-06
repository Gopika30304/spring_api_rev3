package com.helmet.demo.repository;

 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helmet.demo.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
