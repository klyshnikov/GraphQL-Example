package ru.hse.graphexample.dto;

import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class Task {
    String ID;
    String desc;
    String title;

    public Task(String ID, String desc, String title) {
        this.ID = ID;
        this.desc = desc;
        this.title = title;
    }
}
