package librarybook;

public class LibraryBook {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvaialable;
    private static int totalBooksCreated;

    LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvaialable = true;
        totalBooksCreated++;
    }

    public static int getTotalBooks(){
        return totalBooksCreated;
    }

    public void checkOut(){
        this.isAvaialable = false;
    }

    public void returnBook(){
        this.isAvaialable = true;
    }

    public void displayInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Available Books: " + this.isAvaialable);
    }

    public boolean getIsAvailable(){
        return this.isAvaialable;
    }
}
