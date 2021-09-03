package com.spring.feign.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.feign.api.client.UserClient;
import com.spring.feign.api.dto.UserResponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFrignApplication {

	@Autowired
	private UserClient userClient;
	
	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUsers(){
		return userClient.getAllUsers();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFrignApplication.class, args);
	}

}
