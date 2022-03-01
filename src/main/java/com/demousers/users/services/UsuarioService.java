package com.demousers.users.services;

import java.util.ArrayList;
import java.util.Optional;

import com.demousers.users.entities.User;

public interface UsuarioService {
	
	public User saveUser(User user);
	public ArrayList<User> getAllUsers();
	public Optional<User> getUserByEmail(String email);

}
