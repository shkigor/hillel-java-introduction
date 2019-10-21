package academy.learnprogramming.todo;

public class Person {

    private String name;
    private Todo todo;

    public Person(String name) {
        this.name = name;
        todo = new Todo(name);
    }

    public void addToDoCatalog(String catalogName) {
        boolean result = todo.addCatalog(catalogName);
        if (result) {
            System.out.println("+ Каталог \"" + catalogName + "\" успешно добавлен пользователю " + this.name);
        } else {
            System.out.println("- Каталог \"" + catalogName + "\" уже существует");
        }
    }

    public void addTask(String catalogName, String taskName) {
        boolean result = todo.addTask(catalogName, taskName);
        if (result) {
            System.out.println("+ Задача \"" + taskName + "\" добавлена в каталог \"" + catalogName + "\" для пользователя " + name);
        } else {
            System.out.println("- Задача \"" + taskName + "\" не добавлена в каталог \"" + catalogName + "\" для пользователя " + name);
        }
    }

    public void addTask(String taskName) {
        boolean result = todo.addTaskToDefaultCatalog(taskName);
        if (result) {
            System.out.println("+ Задача \"" + taskName + "\" добавлена в каталог по умолчанию для пользователя " + name);
        } else {
            System.out.println("- Задача \"" + taskName + "\" существует в каталоге по умолчанию для пользователя " + name);
        }
    }

    public void printTasks(String catalogName) {
        todo.printTasks(catalogName);
    }

    public void printTasks() {
        todo.printTasks();
    }

    public String getName() {
        return name;
    }
}
