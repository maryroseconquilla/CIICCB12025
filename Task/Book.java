package Task;

public class Book {
    public static void main(String[] args) {
      printBooks(args);
   }

    public static void printBooks(String... books){
        for (int i =0; i < books.length; i++){
            System.out.println();
        }
    }
}

class Book1 {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book1() {            // constructor
        title = "Java Programming";
        author = "John Smith";
        yearPublished=2021;
        price=39.99;
    }

    public void display() {
        System.out.println("Book 1" +  "\n" + "Title: " + title + "\n" + "Author: " + author + "\n" + "Year Published: " + yearPublished + "\n" +  "Price: $" + price);
    }

    public static void main(String[] args) {
        Book1 myBooks = new Book1(); // Calls the default constructor
        myBooks.display(); 
    }
}

class Book2 {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book2() {            // constructor
        title = "Python Basics";
        author = "Jane Doe";
        yearPublished=2020;
        price=29.99;
    }

    public void display() {
        System.out.println("Book 2" +  "\n" + "Title: " + title + "\n" + "Author: " + author + "\n" + "Year Published: " + yearPublished + "\n" +  "Price: $" + price);
    }

    public static void main(String[] args) {
        Book2 myBooks = new Book2(); // Calls the default constructor
        myBooks.display(); 
    }
}


class Book3 {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book3() {            // constructor
        title = "C++ Essentials";
        author = "Michael Johnson";
        yearPublished=2019;
        price=49.99;
    }

    public void display() {
        System.out.println("Book 3" +  "\n" + "Title: " + title + "\n" + "Author: " + author + "\n" + "Year Published: " + yearPublished + "\n" +  "Price: $" + price);
    }

    public static void main(String[] args) {
        Book3 myBooks = new Book3(); // Calls the default constructor
        myBooks.display(); 
    }
}