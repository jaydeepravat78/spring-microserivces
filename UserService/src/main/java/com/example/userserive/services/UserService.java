package com.example.userserive.services;

import com.example.userserive.entity.User;
import com.example.userserive.response.Response;

public interface UserService {
	User addUser(User user);

	Response getUser(long id);
}
