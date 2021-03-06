package com.example.addressservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressservice.enitity.Address;
import com.example.addressservice.repository.AddressRepo;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepo repo;
	
	@Override
	public Address addAddress(Address address) {
		return repo.save(address);
	}
	
	@Override
	public Address getAddress(long id) {
		return repo.findById(id).get();
	}
}
