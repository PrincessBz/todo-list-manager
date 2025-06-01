package com.todo.manager;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask("Buy groceries", "Milk, Bread, Eggs");
        manager.addTask("Complete homework", "Math and Science assignments");

        manager.markTaskAsCompleted(1);

        System.out.println("Your To-Do list:");
        for (Task task : manager.getTasks()) {
            System.out.println(task);
        }
    }

}
