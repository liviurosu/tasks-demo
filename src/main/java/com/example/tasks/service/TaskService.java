package com.example.tasks.service;

import com.example.tasks.model.Task;
import com.example.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepo;

    public List<Task> getAllTasks(){
        return taskRepo.findAll();
    }

    public Task getTaskById(Long id){

            return (Task) taskRepo.findById(id).orElse(null);


    }

    public void createTask(Task task){
        taskRepo.save(task);
    }

    public Task updateTask(Task task){
        return (Task) taskRepo.save(task);
    }

    public void deleteTask(Long id){
        taskRepo.deleteById(id);
        System.out.println("task with id: " + id + " was deleted");
    }

}
