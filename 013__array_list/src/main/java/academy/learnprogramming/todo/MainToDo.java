package academy.learnprogramming.todo;

public class MainToDo {

    public static void main(String[] args) {
        Person igor = new Person("�����");
        igor.addToDoCatalog("���");
        igor.addToDoCatalog("������");

        igor.addTask("���", "������ �����");
        igor.addTask("���",  "������ �����");
        igor.addTask("���1",  "������ �����");
        igor.addTask("���", "������ ������");
        igor.addTask("���", "�������� ���������");

        igor.addTask("���������� �� ����");

        System.out.println("\n*** " + igor.getName() + " - ������ �����: ***");
        igor.printTasks("���");
        igor.printTasks("������");

        System.out.println("\n*** " + igor.getName() + " - ������ ���� �����: ***");
        igor.printTasks();

    }
}
