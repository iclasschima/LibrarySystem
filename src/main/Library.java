package main;

import java.util.LinkedList;
import java.util.List;

public class Library {

    private LinkedList<Book> books = new LinkedList<Book>();


    public LinkedList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

}
