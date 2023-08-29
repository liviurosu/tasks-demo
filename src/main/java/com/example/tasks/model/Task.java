package com.example.tasks.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Tasks")
public class Task {
    @Id
    @GeneratedValue
    Long id;

    String title;

    String description;

    Boolean completed;




}
