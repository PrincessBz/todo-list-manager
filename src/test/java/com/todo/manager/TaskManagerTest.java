package com.todo.manager;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {
    @Test
    public void testAddTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Test Task", "This is a test task");
        List<Task> tasks = manager.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Test Task", tasks.getFirst().getTitle());
    }

    @Test
    public void testRemoveTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Task to Remove", "This task will be removed");
        boolean removed = manager.removeTask(0);
        assertTrue(removed);
        assertEquals(0, manager.getTaskCount());
    }

    @Test
    public void testMarkTaskAsCompleted() {
        TaskManager manager = new TaskManager();
        manager.addTask("Incomplete Task", "This task is incomplete");
        boolean marked = manager.markTaskAsCompleted(0);
        assertTrue(marked);
        assertTrue(manager.getTask(0).isCompleted());
    }

    @Test
    public void testGetTasks() {
        TaskManager manager = new TaskManager();
        manager.addTask("First Task", "Description 1");
        manager.addTask("Second Task", "Description 2");
        List<Task> tasks = manager.getTasks();
        assertEquals(2, tasks.size());
    }

    @Test
    public void testClearTasks() {
        TaskManager manager = new TaskManager();
        manager.addTask("Task 1", "Description 1");
        manager.clearTasks();
        assertEquals(0, manager.getTaskCount());
    }

}
