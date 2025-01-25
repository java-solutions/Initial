package com.example.taskmanager;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = TaskManager.getInstance();
        
        taskManager.addTask("Learn Java");
        taskManager.addTask("Write a task manager");
        
        System.out.println("Tasks:");
        taskManager.listTasks();
        
        taskManager.completeTask(0);
        
        System.out.println("\nUpdated Tasks:");
        taskManager.listTasks();
    }
}
