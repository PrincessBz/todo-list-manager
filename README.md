# To-Do List Manager

A simple command-line To-Do List Manager built with Java, using Maven for dependency management and JUnit 5 for unit testing. The project demonstrates clean code practices, object-oriented design, and automated testing with GitHub Actions.

---

## Features

- Add tasks with a title and description
- Remove tasks by index
- Mark tasks as completed
- List all tasks
- Clear all tasks

---

## Unit Tests

This project includes multiple JUnit 5 tests covering positive and negative scenarios:

- `testAddTask`: Verifies that a task is successfully added.
- `testRemoveTask`: Verifies removal of a valid task by index.
- `testRemoveTaskInvalidIndex`: Verifies that trying to remove a task at an invalid index returns false and does not affect the task list.
- `testMarkTaskAsCompleted`: Verifies marking a task as completed.
- `testGetTasks`: Verifies retrieval of all tasks.
- `testClearTasks`: Verifies that clearing all tasks works as expected.

These tests ensure the core functionality behaves correctly under expected and edge conditions.

---

## Dependencies

- **JUnit 5**: Used for writing and running unit tests.
- Managed via **Maven** with dependencies declared in the `pom.xml`.

Dependencies are pulled from Maven Central repository.

---

## Clean Code Practices

- **Single Responsibility**: Classes such as `Task` and `TaskManager` each have a clear and focused responsibility.
- **Encapsulation**: Task properties are private and accessed via getters/setters.
- **Meaningful Method Names**: Methods like `addTask`, `removeTask`, and `markTaskAsCompleted` clearly describe their actions.
- **Consistent Formatting**: Code is well-indented and follows Java conventions for readability.

---

## Challenges Faced

- Initially struggled with Maven compiler version settings, which caused build errors until Java version was set properly.
- Configuring GitHub Actions to run tests was new but provided great insight into CI/CD practices.
- Writing tests that cover negative cases helped deepen understanding of edge-case handling.

---

## Getting Started

### Prerequisites

- Java 22 (or 17 if you adjust the pom.xml and workflow)
- Maven 3.x

### How to Build and Run

1. Clone the repository:

   ```bash
   git clone https://github.com/PrincessBz/todo-list-manager.git
   cd todo-list-manager
   
2. Build the project using Maven:

   ```bash
    mvn clean install
    ```
3. Run the application:
    ```bash
   java -cp target/todo-list-manager-1.0-SNAPSHOT.jar com.todo.manager.Main
    ```
4. Run the tests:

   ```bash
   mvn test
   ```
