package com.example.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User service isn't available";
	}
	@GetMapping("/addressServiceFallBack")
	public String addressSericeFallBackMethod() {
		return "Address service isn't available";
	}
}
