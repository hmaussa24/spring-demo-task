package com.demousers.users.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demousers.users.entities.User;
import com.demousers.users.repositories.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepo;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return usuarioRepo.save(user);
	}

	@Override
	public ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (ArrayList<User>) usuarioRepo.findAll();
	}

	@Override
	public Optional<User> getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return usuarioRepo.findByEmail(email);
	}


}
