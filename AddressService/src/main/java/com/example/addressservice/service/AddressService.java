package com.example.addressservice.service;

import com.example.addressservice.enitity.Address;

public interface AddressService {
	Address addAddress(Address address);
	
	Address getAddress(long id);
}
