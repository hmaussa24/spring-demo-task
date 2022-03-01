package com.demousers.users.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demousers.users.entities.User;

@Repository
public interface UsuarioRepository extends CrudRepository<User, Long> {
	public abstract Optional<User> findById(Long id);
	public abstract Optional<User> findByEmail(String email);
}
