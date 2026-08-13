import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;


    Book (String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return 
            "Title: " + this.title +  
            "\nAuthor: " + this.author + 
            "\nYear Published: " + this.yearPublished + 
            "\nPrice: " + this.price;
    }
}


public class Task11 {
    public static void main(String[] args) {
        Book [] books = {
            new Book("Java Programming", "John Smith", 2021, 39.99),
            new Book("Python Basics", "Jane Doe", 2020, 29.99),
            new Book("C++ Essentials", "Michael Johnson", 2019, 49.99)
        };
        
        for (int index = 0; index < books.length; index++)
            System.out.println("Book " + (index + 1) + ":\n" + books[index].toString() + '\n');
    }
}
