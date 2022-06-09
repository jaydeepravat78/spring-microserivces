package com.example.userserive.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.userserive.entity.User;
import com.example.userserive.repository.UserRepo;
import com.example.userserive.response.Address;
import com.example.userserive.response.Response;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public User addUser(User user) {
		return repo.save(user);
	}

	@Override
	public Response getUser(long id) {
		Response response = new Response();
		User user = repo.findById(id).get();
		Address address = restTemplate.getForObject("http://ADDRESS-SERVICE/address/" + user.getAddressId(),
				Address.class);
		response.setUser(user);
		response.setAddress(address);
		return response;
	}

}
