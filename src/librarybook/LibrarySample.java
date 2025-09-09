package librarybook;

public class LibrarySample {

    public static void main(String[] args) {
        LibraryBook libraryBook1 = new LibraryBook("A journey to the moon","Edrian Rhymes", "abc123");
        libraryBook1.checkOut();
        LibraryBook libraryBook2 = new LibraryBook("OOP for beginners", "ART", "123");
        libraryBook2.checkOut();
        libraryBook1.returnBook();
        libraryBook1.displayInfo();
        libraryBook2.displayInfo();
        System.out.println(LibraryBook.getTotalBooks());
    }

}
