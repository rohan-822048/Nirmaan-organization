package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Userinterface {
    public static void main(String[] args) {
        ArrayList<book> bookList = new ArrayList<>();
        bookservice service = new bookservice();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    book newBook = service.addBook();
                    bookList.add(newBook);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    service.getBook(bookList);
                    break;
                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int id = sc.nextInt();
                    book result = service.getbookById(id, bookList);
                    if (result != null) {
                        System.out.println("Book Found: ID: " + result.getId() +
                                           ", Name: " + result.getName() +
                                           ", Author: " + result.getAuthor() +
                                           ", Price: " + result.getPrice());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
