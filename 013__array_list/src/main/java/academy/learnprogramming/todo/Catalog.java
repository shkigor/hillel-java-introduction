package academy.learnprogramming.todo;

import java.util.ArrayList;

public class Catalog {
    private String name;
    private ArrayList<Task> tasks;

    public Catalog(String name) {
        this.name = name;
        tasks = new ArrayList<>();
    }

    public boolean addTask(String taskName) {
        Task foundTask = findTask(taskName);
        if (foundTask == null) {
            tasks.add(new Task(taskName));
            return true;
        } else {
            System.out.println("- Задача \"" + taskName + "\" уже существует ");
            return false;
        }

    }

    private Task findTask(String taskName) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (taskName.equalsIgnoreCase(task.getName())) {
                return task;
            }
        }
        return null;
    }

    public void printTasks() {
        System.out.println("\n" + "Категория " + name + ":");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i).getName());
        }
    }

    public String getName() {
        return name;
    }

}
