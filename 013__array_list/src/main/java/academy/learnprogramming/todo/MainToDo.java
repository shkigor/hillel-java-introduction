package academy.learnprogramming.todo;

public class MainToDo {

    public static void main(String[] args) {
        Person igor = new Person("Игорь");
        igor.addToDoCatalog("Дом");
        igor.addToDoCatalog("Работа");

        igor.addTask("Дом", "Купить веник");
        igor.addTask("Дом",  "Купить веник");
        igor.addTask("Дом1",  "Купить веник");
        igor.addTask("Дом", "Помыть посуду");
        igor.addTask("Дом", "Оплатить комуналку");

        igor.addTask("Записаться на курс");

        System.out.println("\n*** " + igor.getName() + " - список задач: ***");
        igor.printTasks("Дом");
        igor.printTasks("Работа");

        System.out.println("\n*** " + igor.getName() + " - список ВСЕХ задач: ***");
        igor.printTasks();

    }
}
