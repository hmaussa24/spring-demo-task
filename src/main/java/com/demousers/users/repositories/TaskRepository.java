package com.demousers.users.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demousers.users.entities.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
   public abstract ArrayList<Task> findByUserId(Long id);   
}
