package main;

public class Book {

    private String name;
    private boolean available;
    private String reader;

    public Book() {}

    public Book(String name) {
        this.name = name;
        available = true;
    }

    String getName() {
        return name;
    }

    boolean isAvailable() {
        return available;
    }

    void setIsAvailable(boolean available) {
        this.available = available;
    }

    void setReader(String name) {
        reader = name;
    }

    String getReader(){
        return reader;
    }
}
