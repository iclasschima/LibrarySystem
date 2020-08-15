package main;

import java.util.LinkedList;
import java.util.List;

public class Person {

    private String name;
    private String currentBook;
    private List<String> readBooks = new LinkedList<String>();

    public Person(String name) {
        this.name = name;
    }

    boolean borrowBook(String bookName, LinkedList<Book> books) {
        if (currentBook != null) {
            return false;
        }
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
               if(book.isAvailable()) {
                   book.setReader(name);
                   book.setIsAvailable(false);
                   setCurrentBook(book.getName());
                   readBooks.add(book.getName());
               }
            }
        }
        return true;
    }

    private void setCurrentBook(String bookName) {
        currentBook = bookName;
    }

    boolean returnBook(List<Book> books) {
        for (Book book : books) {
            if (book.getName().equals(currentBook)) {
                book.setIsAvailable(true);
                book.setReader(null);
                setCurrentBook(null);
                return true;
            }
        }
        return false;
    }

    List<String> getReadBooks() {
        return readBooks;
    }
}
