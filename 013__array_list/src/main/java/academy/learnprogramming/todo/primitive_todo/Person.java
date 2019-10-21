package academy.learnprogramming.todo.primitive_todo;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Task> tasks;

    public Person(String name) {
        this.name = name;
        tasks = new ArrayList<>();
    }

    public void addTask(String comment, String category) {
        Task task = findTask(comment, category);
        if (task == null) {
            tasks.add(new Task(comment, category));
            System.out.println("Задание добавлено *" + comment);
        } else {
            System.out.println("Задание существует *" + comment);
        }
    }

    private Task findTask(String comment, String category) {
        for (Task task: tasks) {
            if (task.getComment().equalsIgnoreCase(comment) && task.getCategory().equalsIgnoreCase(category)) {
                return task;
            }
        }
        return null;
    }

    public void doTask(String comment, String category) {
        Task task = findTask(comment, category);
        if(tasks.remove(task)) {
            System.out.println("Задание выполнено **" + comment);
        } else {
            System.out.println("Задание не найдено **" + comment);
        }
    }

    public void printTasks(String category) {
        System.out.println("\nКатегория: " + category);
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getCategory().equalsIgnoreCase(category)) {
                System.out.println("Задание: " + tasks.get(i).getComment());
            }
        }
    }
}
