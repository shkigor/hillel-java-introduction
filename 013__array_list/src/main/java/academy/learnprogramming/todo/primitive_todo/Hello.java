package academy.learnprogramming.todo.primitive_todo;

/**
 * Created first java class
 */
public class Hello {
    public static void main(String[] args) {

        Person misha = new Person("Михаил");
        String homeCategory = "Дом";
        misha.addTask("Сходить за продуктами в магазин", homeCategory);
        misha.addTask("Убрать в квартире", homeCategory);

        String workCategory = "Работа";
        misha.addTask("Подписать отпускной лист", workCategory);
        misha.printTasks(homeCategory);
        misha.printTasks(workCategory);

        misha.doTask("Подписать отпускной лист", workCategory);
        misha.printTasks(workCategory);

    }
}
