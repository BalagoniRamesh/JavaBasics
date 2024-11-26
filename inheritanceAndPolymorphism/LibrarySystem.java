package inheritanceAndPolymorphism;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter book author: ");
        String bookAuthor = scanner.nextLine();
        System.out.print("Enter book price: ");
        int bookPrice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("\nEnter DVD title: ");
        String dvdTitle = scanner.nextLine();
        System.out.print("Enter DVD director: ");
        String dvdDirector = scanner.nextLine();
        System.out.print("Enter DVD price: ");
        int dvdPrice = scanner.nextInt();

        Book book = new Book(bookTitle, bookAuthor, bookPrice);
        DVD dvd = new DVD(dvdTitle, dvdDirector, dvdPrice);

        System.out.println("\nBook Information:");
        book.displayInfo();

        System.out.println("\nDVD Information:");
        dvd.displayInfo();

        scanner.close();
    }
}
