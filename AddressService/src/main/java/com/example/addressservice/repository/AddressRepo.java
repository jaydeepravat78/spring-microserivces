package com.example.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addressservice.enitity.Address;

public interface AddressRepo extends JpaRepository<Address, Long>{

}
