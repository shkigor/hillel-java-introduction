package academy.learnprogramming.load_books;

import academy.learnprogramming.csv_reader.Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MainSystem {

    public static void main(String[] args) throws IOException {
        List<Book> bookList = loadBooks("C:/DATA/books.txt");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public static List<Book> loadBooks(String pathname) throws IOException {
        File file = new File(pathname);
        FileReader fileReader = new FileReader(file, Charset.forName("Windows-1251"));
        BufferedReader br = new BufferedReader(fileReader);
        String str;
        List<Book> bookList = new ArrayList<>();
        while ((str = br.readLine()) != null) {
            String[] rows = str.split(";");
            bookList.add(createBook(rows));
        }
        return bookList;
    }

    private static Book createBook(String[] rows) {
        String name = rows[0];
        int price = Integer.parseInt(rows[1]);
        String author = rows[2];
        return new Book(name, price, author);
    }
}
