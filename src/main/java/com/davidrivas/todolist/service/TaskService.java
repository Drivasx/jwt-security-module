package com.davidrivas.todolist.service;

import com.davidrivas.todolist.entity.Task;
import com.davidrivas.todolist.entity.User;
import com.davidrivas.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks(){
        return (List<Task>) taskRepository.findAll();
    }

    public List<Task> getTasksByUser(User user){
        return taskRepository.findTasksByUser(user).orElseThrow();
    }

    public Task saveTask(Task task){
        if(taskRepository.existsById(task.getId())){
            return null;
        }

        Task newTask = new Task();
        newTask.setNameTask(task.getNameTask());
        newTask.setDescription(task.getDescription());
        newTask.setCreatedAt(LocalDate.now());
        newTask.setDeadline(task.getDeadline());
        newTask.setUser(task.getUser());

        return taskRepository.save(newTask);
    }
}
