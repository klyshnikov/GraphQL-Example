package ru.hse.graphexample.dto;

import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class Task {
    String desc;
    String title;

    public Task(String desc, String title) {
        this.desc = desc;
        this.title = title;
    }
}
