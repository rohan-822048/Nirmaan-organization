package Day4;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("enter the first number:");
		double a = sc.nextDouble();
		
		System.out.print("enter the second number:");
		double b = sc.nextDouble();
		
		System.out.print("enter the opreator (+,-,*,/):");
		char op = sc.next().charAt(0);
		
		double result = 0;
		
		if (op=='+') {
			result = a+b;
		} else if (op=='-') {
			result = a-b;
		} else if (op=='*') {
			result = a*b;
		} else if (op=='/') {
			if (b==0) {
				System.out.println("Error:Division by zero not allowed");
				sc.close();
				return;
			}else {
				result =a/b;
			}
		}else {
			System.out.println("Invalid opreator");
			sc.close();
			return;
		}
		
		System.out.println("result:"+ result);
		sc.close();
	}
	{
	}
	
	}
