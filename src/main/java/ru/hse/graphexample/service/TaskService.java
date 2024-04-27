package ru.hse.graphexample.service;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.graphexample.dto.Task;

import java.util.ArrayList;
import java.util.UUID;

import java.util.List;

@RestController
public class TaskService {
    public List<Task> tasks = new ArrayList<>();

    @QueryMapping
    public List<Task> findAll() {
        return tasks;
    }

    @MutationMapping
    public Task createTask(@Argument String desc, @Argument String title) {
        UUID uuid = UUID.randomUUID();
        Task createdTask = new Task(uuid.toString(), desc, title);
        tasks.add(createdTask);
        return createdTask;
    }
}
