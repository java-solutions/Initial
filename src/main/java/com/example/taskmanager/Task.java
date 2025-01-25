package com.example.taskmanager;

public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void complete() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[x] " : "[ ] ") + description;
    }
}
