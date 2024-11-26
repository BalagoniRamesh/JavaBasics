package LibrarySystem;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println("Book title: "+book.getTitle() + " > Author: "+book.getAuthor() + " > (ISBN: " + book.getIsbn() + ")");
        }
    }

    public void searchByTitle(String title) {
        System.out.println("Search Results:");
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
            }
        }
    }

    public void searchByAuthor(String author) {
        System.out.println("Search Results:");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
            }
        }
    }
}

