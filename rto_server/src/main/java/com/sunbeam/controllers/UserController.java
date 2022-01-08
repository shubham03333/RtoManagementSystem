package com.sunbeam.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dtos.Credentials;
import com.sunbeam.dtos.Response;
import com.sunbeam.dtos.UserDTO;
import com.sunbeam.entities.User;
import com.sunbeam.services.UserServiceImpl;
@CrossOrigin(origins = "*")
@RestController
public class UserController {
	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/user/signin")
	public ResponseEntity<?> signIn(@Valid @RequestBody Credentials cred) {
		UserDTO userDto = userService.findUserByEmailAndPassword(cred);
		if(userDto == null)
			return Response.error("user not found");
		return Response.success(userDto);
	}
	
	@PostMapping("/user/signup")
	public ResponseEntity<?> signUp(@RequestBody UserDTO userDto) {
		UserDTO result = userService.saveUser(userDto);
		return Response.success(result);
	}

	@PostMapping("/user/register")
	public ResponseEntity<?> signUp1(@RequestBody UserDTO userDto) {
		UserDTO result = userService.saveUser(userDto);
		return Response.success(result);
	}
	
	@GetMapping("/user/search")
	public ResponseEntity<?> findUser() {
		List<User> result = new ArrayList<>();
			result = userService.findAllUsers();
		return Response.success(result);
	}

	
}
