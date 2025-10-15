package com.davidrivas.todolist.repository;

import com.davidrivas.todolist.entity.Task;
import com.davidrivas.todolist.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Integer> {

    Optional<List<Task>> findTasksByUser(User user);
}
