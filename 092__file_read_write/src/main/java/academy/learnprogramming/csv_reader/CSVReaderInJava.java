package academy.learnprogramming.csv_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderInJava {

    public static void main(String... args) {
        List<Book> books = readBooksFromCSV("books.txt");
        // let's print all the person read from CSV file
        for (Book b : books) {
            System.out.println(b);
        }
    }

    private static List<Book> readBooksFromCSV(String fileName) {
        List<Book> books = new ArrayList<>();
//        Path pathToFile = Paths.get(fileName);
        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
//        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

        File file = getFileFromResources(fileName);
            try (FileReader reader = new FileReader(file, StandardCharsets.US_ASCII);
                 BufferedReader br = new BufferedReader(reader)) {
            // read the first line from the text file
            String line = br.readLine();
            // loop until all lines are read
            while (line != null) {
                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                Book book = createBook(attributes);
                // adding book into ArrayList
                books.add(book);
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return books;
    }

    private static Book createBook(String[] metadata) {
        String name = metadata[0];
        int price = Integer.parseInt(metadata[1]);
        String author = metadata[2]; // create and return book of this metadata
        return new Book(name, price, author);
    }

    // get file from classpath, resources folder
    private static File getFileFromResources(String fileName) {
//        ClassLoader classLoader = getClass().getClassLoader();
        ClassLoader classLoader = CSVReaderInJava.class.getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

}
