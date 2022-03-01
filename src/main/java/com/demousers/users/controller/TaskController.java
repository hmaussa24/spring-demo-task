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

import com.demousers.users.entities.Task;
import com.demousers.users.services.TaskServiceImpl;

@RestController
@RequestMapping(path =  "api/tasks")
public class TaskController {
	
	@Autowired
	TaskServiceImpl taskService;
	
	@GetMapping(path = "/{id}")
	public Optional<Task> getTaskById(@PathVariable("id") Long id) {
		return taskService.getById(id);
	}
	
	@GetMapping(path = "/user/{id}")
	public ArrayList<Task> getByUser(@PathVariable("id") Long id){
		return taskService.getByUser(id);
	}
	
	@PostMapping(path = "/crear")
	public ResponseEntity<?> saveTask(@RequestBody Task task){
		return ResponseEntity.status(HttpStatus.CREATED).body(taskService.saveTask(task));
	}

}
