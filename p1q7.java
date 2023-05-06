/*Create a class called "Book" with a constructor that includes the title, author,
publication year, and the number of book pages. The class should have methods for
setting and getting these attributes and a method for checking if the book is longer than
another book.
 */

class Book{
    String title;
    String author;
    int publicationYear;
    int numPages;
    
    public Book(String title, String author, int publicationYear, int numPages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numPages = numPages;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
    
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    public int getNumPages() {
        return numPages;
    }
    
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    
    public boolean isLonger(Book other) {
        return this.numPages > other.getNumPages();
    }
}
public class p1q7 {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281);
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 277);
        
        book1.setTitle("Go Set a Watchman");
        book1.setAuthor("Harper Lee");
        book1.setPublicationYear(2015);
        book1.setNumPages(288);
        
        book2.setTitle("Franny and Zooey");
        book2.setAuthor("J.D. Salinger");
        book2.setPublicationYear(1961);
        book2.setNumPages(201);

        if (book1.isLonger(book2)) {
            System.out.println(book1.getTitle() + " is longer than " + book2.getTitle());
        } else {
            System.out.println(book2.getTitle() + " is longer than " + book1.getTitle());
        }
    }
}
