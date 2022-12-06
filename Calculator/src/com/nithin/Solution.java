package com.nithin;

import java.util.Scanner;

public class Solution extends CalculatorImpl{



	static Scanner s = new Scanner(System.in);       //declaring it outside main class to avoid confusion between choice and integer inputs 
	static int a;
	static int b;

	static void acceptInput() {
		System.out.print("Enter 1st number : ");
		a = s.nextInt();
		System.out.print("Enter 2nd number : ");
		b = s.nextInt();
	}



	public static void main(String[] args) {


		Calculator s1 = new CalculatorImpl();            //up-casting to hide the implementation

		while (true) {

			System.out.println("Select 1 for Addition \nSelect 2 forSubtraction \nSelect 3 for Multiplication \nSelect 4 for Division \nSelect 5 to Exit");
			int choice = s.nextInt();


			if(choice>=1 && choice<=4) {               // so that when 5 is entered it will affect the choice by default
				acceptInput();
			}


			switch (choice) {
			case 1:
				System.out.println(s1.add(a, b));
				break;
			case 2:
				System.out.println(s1.sub(a, b));
				break;
			case 3:
				System.out.println(s1.mul(a, b));
				break;
			case 4:
				System.out.println(s1.div(a, b));
				break;
			case 5:
				System.out.println("Bye Bye");
				System.exit(0);                                       //to exit the program
				break;

			default:
				System.out.println(s1.displayErrorMessage());

			}
		}


		//Optimized code


		/*



		 */



	}
}
