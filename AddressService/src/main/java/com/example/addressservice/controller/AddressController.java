package com.example.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressservice.enitity.Address;
import com.example.addressservice.service.AddressService;

@RequestMapping("/address")
@RestController
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@PostMapping("/")
	public Address addAddress(@RequestBody Address address) {
		return addressService.addAddress(address);
	}
	
	@GetMapping("/{id}")
	public Address getAddress(@PathVariable long id) {
		return addressService.getAddress(id);
	}
}