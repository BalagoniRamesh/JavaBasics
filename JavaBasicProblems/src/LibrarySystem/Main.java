package LibrarySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some sample books to the library
        library.addBook(new Book("Java", "Ram", "9780446310789"));
        library.addBook(new Book("C++ ", "kalyan", "9780451524935"));
        library.addBook(new Book("Python", "purna", "9780486284736"));

        // Display available books
         library.displayBooks();

        // Search for a book by title
        Scanner scan = new Scanner(System.in);
        System.out.println("Book by title: ");
        String title = scan.nextLine();
        library.searchByTitle(title+"");

        // Search for a book by author
        System.out.println("book by author: ");
        String author = scan.nextLine();
        library.searchByAuthor(author+"");
    }
}
