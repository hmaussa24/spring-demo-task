package com.demousers.users.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demousers.users.entities.Task;
import com.demousers.users.repositories.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskRepository taskRepo;
	
	@Override
	public Optional<Task> getById(Long id) {
		// TODO Auto-generated method stub
		return taskRepo.findById(id);
	}

	@Override
	public ArrayList<Task> getByUser(Long id) {
		// TODO Auto-generated method stub
		return taskRepo.findByUserId(id);
	}

}
