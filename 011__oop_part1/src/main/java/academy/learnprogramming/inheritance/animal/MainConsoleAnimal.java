package academy.learnprogramming.inheritance.animal;

import java.util.Scanner;

/*
    ������� ������������ ����� Animal � �������� ������ Dog � Cat.
    � ������ Animal �������� ���� name. ������� �����������, ������� ����������������� ���� name.
    ������� ����� getName(), ������� ����� ���������� �������� ���� name.
    � ������� Dog � Cat ���������� ����� ������� ����������� � �������������� ����� getName().
    ��� ������ Dog ����� getName() ������ ���������� ������ "� ������. ����� ���� - ". � ������ ��������
    ����� ������ getName() ����������� (������ Animal).
    ��� ������ Cat ����� getName() ������ ���������� ������ "� ���. ����� ���� - ". � ������ ��������
    ����� ������ getName() ����������� (������ Animal).

    ������� ����� AnimalFactory, � ������� �������� ����������� ����� getAnimalByKey,
    ����� getAnimalByKey ��������� ���� ��������� �������� key � ���������� ��� Animal.
    � ������ getAnimalByKey ������ AnimalFactory ���������� ������ ����������� ��������.
    ���� �������� �� ����� "da" ��� "db" ��� "dc" ��� "ca" ��� "cb" ��� "cc" ���������� null.

    ���� �������� �����:
        "da" - ���������� �������� ������ Dog � ������ "������"
        "db" - ���������� �������� ������ Dog � ������ "����"
        "dc" - ���������� �������� ������ Dog � ������ "������"
        "ca" - ���������� �������� ������ Cat � ������ "������"
        "cb" - ���������� �������� ������ Cat � ������ "������"
        "cc" - ���������� �������� ������ Cat � ������ "������"

    ������� ����������, ������� ����� ��������� � ������� ������.
    ��������� ������������� �������� �������� ���������� � ����������� ����� getAnimalByKey ������ AnimalFactory.
    ���� ����� getAnimalByKey ���������� null, ���������� ������� � ������� ������ "�� ���� ������� Animal"
    � ��������� ������������ ������ ��������� ������ (�.�. �� ������� �� ���������).
    ����� ���������� ������� � ������� ��������� ����������������� ������ getName() � ������� Dog � Cat � ����� �� ���������.
*/

public class MainConsoleAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ��� �������� ������� Animal:");
        String inputString = scanner.nextLine();
        while (true) {
            Animal animal = AnimalFactory.getAnimalByKey(inputString.toLowerCase());
            if (animal != null) {
                System.out.println(animal.getName());
                break;
            } else {
                System.out.println("�� ���� ������� Animal");
            }
            inputString = scanner.nextLine();
        }
    }
}
