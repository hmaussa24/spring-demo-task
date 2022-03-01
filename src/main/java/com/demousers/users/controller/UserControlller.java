package com.demousers.users.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demousers.users.entities.User;
import com.demousers.users.services.UsuarioServiceImpl;

@RestController
@RequestMapping("api/users")
public class UserControlller {

	@Autowired
	UsuarioServiceImpl userService;
	
	@GetMapping(path = "/all")
	public ArrayList<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping(path = "/{email}")
	public Optional<User> getUserByEmail(@PathVariable("email") String email){
		return userService.getUserByEmail(email);
	}
	
	@PostMapping(path = "/crear")
	public ResponseEntity<?> saveUser(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));
	}
}

