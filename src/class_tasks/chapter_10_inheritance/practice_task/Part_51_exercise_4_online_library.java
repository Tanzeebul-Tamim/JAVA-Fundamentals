package class_tasks.chapter_10_inheritance.practice_task;

import java.util.Scanner;

/*
    You have to implement a library using Java Class Library.
    Methods: addBook, issueBook, returnBook, showAvailableBooks, showIssuedBooks
    Properties: Array to store the available and Array to store the issued books
 */

class Library {
    String[] availableBooks;
    int availableCount;

    String[] issuedBooks;
    int issuedCount;

    Library(int capacity) {
        this.availableBooks = new String[capacity];
        this.availableCount = 0;

        this.issuedBooks = new String[capacity];
        this.issuedCount = 0;
    }

    void addBook(String addedBook) {
        if (addedBook.equals("Issued") || addedBook.equals("issued")) {
            System.out.println("Invalid Name\n");
            return;
        }

        if (availableCount >= availableBooks.length) {
            System.out.println("The library has reached its maximum capacity.\n");
            return;
        }

        this.availableBooks[availableCount] = addedBook;
        availableCount++;
        System.out.printf("\"%s\" has been added!\n\n", addedBook);
    }

    void showAvailableBooks() {
        System.out.println("\nAvailable books are:");
        for (int i = 0; i < availableBooks.length; i++) {
            String availableBook = availableBooks[i];

            if (availableBook == null) {
                break;
            }

            if (availableBook.equals("Issued")) {
                continue;
            }

            System.out.printf("%d. %s\n", (i + 1), availableBook);
        }
    }

    void issueBook(String issuedBook) {
        for (int i = 0; i < this.availableBooks.length; i++) {
            if (this.availableBooks[i] != null && this.availableBooks[i].equals(issuedBook)) {
                System.out.printf("\"%s\", this book has been issued!\n\n", issuedBook);
                this.availableBooks[i] = "Issued";
                this.issuedBooks[issuedCount] = issuedBook;
                issuedCount++;
                return;
            }
        }
        System.out.printf("\"%s\", this book doesn't exist!\n\n", issuedBook);
    }

    void showIssuedBooks() {
        System.out.println("\nIssued books are:");
        for (int i = 0; i < issuedBooks.length; i++) {
            String issuedBook = issuedBooks[i];

            if (issuedBook == null) {
                continue;
            }

            System.out.printf("%d. %s\n", (i + 1), issuedBook);
        }
    }

    void returnBook(String returnedBook) {
        for (int i = 0; i < this.issuedBooks.length; i++) {
            if (this.issuedBooks[i] != null && this.issuedBooks[i].equals(returnedBook)) {
                System.out.printf("\"%s\", this book has been returned!\n\n", returnedBook);
                this.issuedBooks[i] = null;
                issuedCount--;

                for (int j = 0; j < this.availableBooks.length; j++) {
                    if (this.availableBooks[j] != null && this.availableBooks[j].equals("Issued")) {
                        this.availableBooks[j] = returnedBook;
                        break;
                    }
                }

                return;
            }
        }
        System.out.printf("\"%s\", this book wasn't issued!\n\n", returnedBook);
    }
}

public class Part_51_exercise_4_online_library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your library capacity:");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Library centralLibrary = new Library(capacity);

        System.out.println("\nEnter the name of your book:");
        System.out.println("Enter \"stop\" to exit\n");
        while (true) {
            String addedBook = scanner.nextLine();

            if (addedBook.equals("stop")) {
                break;
            }

            centralLibrary.addBook(addedBook);
        }

        centralLibrary.showAvailableBooks();

        System.out.println("\nEnter the name of the book that you want to issue:");
        System.out.println("Enter \"stop\" to exit\n");
        while (true) {
            String issuedBook = scanner.nextLine();

            if (issuedBook.equals("stop")) {
                break;
            }

            centralLibrary.issueBook(issuedBook);
        }

        centralLibrary.showIssuedBooks();
        centralLibrary.showAvailableBooks();

        System.out.println("\nEnter the name of the book that you want to return:");
        System.out.println("Enter \"stop\" to exit\n");
        while (true) {
            String returnedBook = scanner.nextLine();

            if (returnedBook.equals("stop")) {
                break;
            }

            centralLibrary.returnBook(returnedBook);
        }

        centralLibrary.showIssuedBooks();
        centralLibrary.showAvailableBooks();

        scanner.close();
    }
}
