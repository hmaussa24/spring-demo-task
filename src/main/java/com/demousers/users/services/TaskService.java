package com.demousers.users.services;

import java.util.ArrayList;
import java.util.Optional;

import com.demousers.users.entities.Task;

public interface TaskService {
   public Optional<Task> getById(Long id);
   public ArrayList<Task> getByUser(Long id);
   public Task saveTask(Task task);
}
