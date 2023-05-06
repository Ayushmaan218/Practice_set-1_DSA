/*Write a Java class called "Book" that has the following instance variables:
Title (String), author (String), publisher (String), year (int). The class should have two
constructors:
A parameterless constructor that initialises the instance variables with default values
(“Unknown” for the strings and 0 for the int)
A parameterised constructor that takes in the title, author, publisher, and year, and initialises
the corresponding instance variables */
class Book{
    String title;
    String author;
    String publisher;
    int year;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.publisher = "Unknown";
        this.year = 0;
    }

    public Book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
public class p1q8 {
    public static void main(String[] args) {
        
        Book book1 = new Book();

        book1.setTitle("The Catcher in the Rye");
        book1.setAuthor("J.D. Salinger");
        book1.setPublisher("Little, Brown and Company");
        book1.setYear(1951);

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Publisher: " + book1.getPublisher());
        System.out.println("Year: " + book1.getYear());

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960);

        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Publisher: " + book2.getPublisher());
        System.out.println("Year: " + book2.getYear());
    }
}
