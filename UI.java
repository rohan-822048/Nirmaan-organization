package Day14;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		boolean iswork = true;
		
		while (iswork) {
			System.out.println("Enter 1 for Add Student");
			System.out.println("Enter 2 for update Student");
			System.out.println("Enter 3 for show Student");
			System.out.println("Enter 0 for exit");
			int key = sc.nextInt();
			
			if (key == 1 || key == 2) {
				System.out.println("Enter the Student ID");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Student Name");
				String name = sc.nextLine();
				System.out.println("Enter the Student rollNo");
				int rollNo = sc.nextInt();
				
				std=new Student(id,name,rollNo);
			
			}else if(key == 3) {
				System.out.println(std);
				
			}else if (key == 0) {
				iswork = false;
				System.out.println("exiting...");
			
			}else {
				System.out.println("Invalid input!");
				
				sc.close();
				
			}
		}
	}

}
