package library;

import java.util.ArrayList;
import java.util.Scanner;

public class bookservice {
	Scanner sc = new Scanner(System.in);
	
	// add book
	public book addBook() {
		System.out.println("enter the book ID");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("enter the book Name");
		String name = sc.nextLine();

		System.out.println("enter the Author");
		String Author = sc.nextLine();

		System.out.println("enter the book price");
		double price = sc.nextDouble();

		return new book(id, name, Author, price);
	}

	// read all books
	public void getBook(ArrayList<book> Books) {
		System.out.println("books");
		for (book b : Books) {
			System.out.println("ID: " + b.getId() + ", Name: " + b.getName() + ", Author: " + b.getAuthor() + ", Price: " + b.getPrice());
		}
	}

	// read books By ID
	public book getbookById(int id, ArrayList<book> books) {
		for (book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null; 
	}
}
