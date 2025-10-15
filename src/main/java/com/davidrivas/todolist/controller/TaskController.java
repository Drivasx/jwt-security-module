package com.davidrivas.todolist.controller;

import com.davidrivas.todolist.entity.Task;
import com.davidrivas.todolist.entity.User;
import com.davidrivas.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {


    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    @PostMapping
    public ResponseEntity<Task> saveTask(@RequestBody Task newTask){
        return ResponseEntity.ok(taskService.saveTask(newTask));
    }
}
