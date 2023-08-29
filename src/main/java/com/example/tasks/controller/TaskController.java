package com.example.tasks.controller;

import com.example.tasks.model.Task;
import com.example.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping(value="/tasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping(value="/tasks/{id}")
    public Task getTaskById(@PathVariable Long id){
        return taskService.getTaskById(id);
    }

    @PostMapping(value = "/tasks")
    public List<Task> createTask(Task task){
        taskService.createTask(task);
        return taskService.getAllTasks();
    }

    @PutMapping(value = "/tasks/{id}")
    public Task updateTask(Task task, @PathVariable Long id){
        taskService.updateTask(task);
        return task;
    }

    @DeleteMapping(value = "/tasks/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        System.out.println();
    }



}
