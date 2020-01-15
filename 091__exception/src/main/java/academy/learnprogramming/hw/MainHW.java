package academy.learnprogramming.hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class MainHW {
    public static void main(String[] args) {
        File file = new File("/home/igor/test.txt");

        int intLines = 0;
        int bustedLines = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);

                try {
                    System.out.println(Integer.parseInt(data));
                    intLines++;
                } catch (NumberFormatException e) {
                    bustedLines++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(scanner)) {
                scanner.close();
            }
        }

        System.out.println("intLines = " + intLines);
        System.out.println("bustedLines = " + bustedLines);

    }
}
