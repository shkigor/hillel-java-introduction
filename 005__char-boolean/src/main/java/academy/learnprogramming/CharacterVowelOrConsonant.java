package academy.learnprogramming;

import java.util.Scanner;

/*
Напишите программу, в которой пользователю нужно ввести один символ из алфавита.
В зависимости от ввода пользователя, выведите в консоль: "Гласная буква" или "Согласная буква".
Если пользовательский ввод не является буквой (между а и я или А и Я) или является строкой длиной > 1, выведите сообщение об ошибке.
Проверку является ли введенный символ буквой (между а и я или А и Я) осуществить с помощью проверки кодов Юникоде.
 */

public class CharacterVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите букву русского алфавита: ");
        String letter = scan.nextLine();
        System.out.println("Вы ввели: " + letter);
        int lengthOfLetter = letter.length();
        char firstLetter = letter.charAt(0);

//        if (lengthOfLetter > 1) {
//            System.out.println("Ошибка: Вы ввели больше одного символа.");
//        } else if ((firstLetter < 1040 && firstLetter != 1025) || (firstLetter > 1103 && firstLetter != 1105)) {
//            System.out.println("Ошибка: Вы ввели некорректный символ.");
//        } else {
//            System.out.println("Код символа " + firstLetter + " = " + (int) firstLetter);
//        }

        if (lengthOfLetter > 1) {
            System.out.println("Ошибка: Вы ввели больше одного символа.");
        } else if ((firstLetter < '\u0410' && firstLetter != 1025) || (firstLetter > '\u044f' && firstLetter != 1105)) {
            System.out.println("Ошибка: Вы ввели некорректный символ.");
        } else {
            System.out.println("Код символа " + firstLetter + " = " + (int) firstLetter);
            // В русском языке 10 гласных букв (а, у, о, ы, и, э, я, ю, ё, е)
            String lowCase = Character.toString(firstLetter).toLowerCase();
            firstLetter = lowCase.charAt(0);
            if (firstLetter == 'а'
                    || firstLetter == 'у'
                    || firstLetter == 'о'
                    || firstLetter == 'ы'
                    || firstLetter == 'и'
                    || firstLetter == 'э'
                    || firstLetter == 'я'
                    || firstLetter == 'ю'
                    || firstLetter == 'ё'
                    || firstLetter == 'е') {
                System.out.println("Гласная буква");
            } else {
                System.out.println("Согласная буква");
            }
        }

    }
}
