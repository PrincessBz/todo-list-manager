package com.todo.manager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    public boolean removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            return true;
        }
        return false;
    }

    public boolean markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setCompleted(true);
            return true;
        }
        return false;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks); // Return a copy to prevent external modification
    }

    public Task getTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            return tasks.get(index);
        }
        return null; // Return null if index is out of bounds
    }

    public int getTaskCount() {
        return tasks.size();
    }
    public void clearTasks() {
        tasks.clear(); // Clear all tasks
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TaskManager:\n");
        for (int i = 0; i < tasks.size(); i++) {
            sb.append(i).append(": ").append(tasks.get(i)).append("\n");
        }
        return sb.toString();
    }
}