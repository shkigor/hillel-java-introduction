package academy.learnprogramming.weresquirrel.using_arrays;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Different ways of Reading a text file in Java
 * https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
 *
 * Многомерные массивы
 * https://javarush.ru/groups/posts/mnogomernye-massivy
 *
 * Number of lines in a file in Java
 * https://stackoverflow.com/questions/453018/number-of-lines-in-a-file-in-java
 *
 *
 * Белка-оборотень
 * Время от времени, как правило, между 8 и 10 часами вечера Жак превращается
 * в маленького пушистого грызуна с густым хвостом.
 * С одной стороны, Жак очень рад, что у него не классическая ликантропия.
 * Превращение в белку вызывает меньше проблем, чем в волка. Можно не
 * переживать о том, чтобы случайно не съесть соседа (это было бы неловко).
 * Но зато он беспокоится о том, что его может съесть соседский кот. Он уже
 * дважды просыпался на верхушке дуба, на слишком тонкой ветке, обнаженный
 * и сбитый с толку. Он пытался запирать на ночь двери и окна своей
 * комнаты и клал на пол горсть грецких орехов, чтобы отвлечь самого себя.
 * Это решило проблемы с кошками и деревьями. Но Жак предпочел бы
 * полностью избавиться от своего состояния. Нерегулярность трансформаций
 * наводит его на мысль, что они могут быть вызваны чем-то. Некоторое
 * время он считал, что такое происходит только в те дни, когда он находится
 * рядом с дубами. Он попробовал держаться подальше от дубов, но это не
 * решило проблему.
 * Выбрав более научный подход, Жак стал вести дневник, куда записывал, что
 * он делал в данный день и изменял ли он тогда форму. По этим данным он надеется
 * определить конкретные условия, которые приводят к трансформациям.
 * Главное, что ему нужно, - структура данных для хранения этой информации.
 *
 */
public class Squirrel {

    public static void main(String[] args) throws IOException {
        String filename = "C:/DATA/journalEvents_ru.csv";

        int countLines = Util.countLinesOld(filename);

        String[][] events = loadEvents(filename, countLines);
        System.out.println(java.util.Arrays.deepToString(events));

        boolean[] squirrels = loadSquirrels(filename, countLines);
        System.out.println(Arrays.toString(squirrels));

        int[] tableForPizza = tableFor("ел пиццу", events, squirrels);
        System.out.println(Arrays.toString(tableForPizza));

        System.out.println("phi (pizza) = " + phi(tableForPizza));

        String[] allEvents = journalEvents(events);
        System.out.println(Arrays.toString(allEvents));

        for (String event: allEvents) {
            System.out.printf("%-21s: %1.9f", event, phi(tableFor(event, events, squirrels)));
            System.out.println();
        }

        System.out.println("\nДля корреляции > 0.1 или < -0.1");
        for (String event: allEvents) {
            double correlation = phi(tableFor(event, events, squirrels));
            if (correlation > 0.1 || correlation < -0.1) {
                System.out.printf("%-21s: %1.9f", event, correlation);
                System.out.println();
            }
        }

        String eventPeanutsTeeth = "арахис-зубы";
        for (int i = 0; i < events.length; i++) {
            String[] dayEvents = events[i];
            if (includes("ел арахис", dayEvents) && !includes("чистил зубы", dayEvents)) {
                events[i] = addEvent(eventPeanutsTeeth, dayEvents);
            }
        }

        System.out.println("\nДля нового события");
        System.out.printf("%-21s: %1.9f", eventPeanutsTeeth, phi(tableFor(eventPeanutsTeeth, events, squirrels)));
        System.out.println();
    }

    private static String[] journalEvents(String[][] events) {
        String[] allEvents = new String[0];
        for (String[] dayEvents : events) {
            for (String event : dayEvents) {
                if (!includes(event, allEvents)) {
                    allEvents = addEvent(event, allEvents);
                }
            }
        }
        return allEvents;
    }

    private static String[] addEvent(String event, String[] allEvents) {
        String[] newArray = Arrays.copyOf(allEvents, allEvents.length + 1);
        newArray[newArray.length - 1] = event;
        return newArray;
    }

    private static double phi(int[] table) {
        return (table[3] * table[0] - table[2] * table[1]) /
                Math.sqrt((table[2] + table[3]) *
                        (table[0] + table[1]) *
                        (table[1] + table[3]) *
                        (table[0] + table[2]));
    }

    private static int[] tableFor(String event, String[][] events, boolean[] squirrels) {
        int[] table = new int[4];
        for (int i = 0; i < events.length; i++) {
            int index = 0;
//            for (int j = 0; j < events[i].length; j++) {
//                if (events[i][j].equals(event)) {
//                    index += 1;
//                }
//            }
            if (includes(event, events[i])) {
                index += 1;
            }
            if (squirrels[i]) {
                index += 2;
            }
            table[index] += 1;
        }
        return table;
    }

    private static boolean includes(String event, String[] dayEvents) {
        for (String s : dayEvents) {
            if (s.equals(event)) {
                return true;
            }
        }
        return false;
    }

    private static boolean[] loadSquirrels(String pathname, int lines) throws IOException {
        File file = new File(pathname);
        boolean[] squirrels = new boolean[lines];

        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(fileReader)) {
            for (int i = 0; i < lines; i++) {
                String str = br.readLine();
                String[] columns = str.split(",");
                // Remove last element in array
                String squirrel = columns[columns.length - 1];
                squirrels[i] = squirrel.equals("true");
            }
        }
        return squirrels;
    }

    public static String[][] loadEvents(String pathname, int lines) throws IOException {
        File file = new File(pathname);
        String[][] allEvents = new String[lines][];

        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(fileReader)) {
            String str;
            int lineNumber = 0;
            while ((str = br.readLine()) != null) {
                String[] columns = str.split(",");
                // Remove last element in array
                String[] dayEvents = Arrays.copyOf(columns, columns.length - 1);
                allEvents[lineNumber] = dayEvents;
                lineNumber++;
            }
        }
        return allEvents;
    }


}
