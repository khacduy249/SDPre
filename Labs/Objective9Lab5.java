import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    	Scanner kb = new Scanner (System.in);
			double num1, num2;
			boolean keepGoing = true;
			int choice;
			double answer = 0.0;
			System.out.println("Please give me a number:");
					num1 = kb.nextDouble();
					System.out.println("Please give me a number:");
					num2 = kb.nextDouble();

			while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

				switch (choice) {
					case 1:
					System.out.println(num1 + " + " + num2 + " = " +(num1 + num2));
					break;
					case 2:
					System.out.println("The average of " + num1 + " and " +num2 + " is " +(num1 + num2)/2);
					break;
					case 3:
					System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " +num2 + " is " + (num1 + num2)*0.0831);
					break;
					case 4:
					System.out.println("You've chosen to quit.");
					break;
					default:
					System.out.println("Invalid entry. Please try again");
				}
	}
}

			public static void printMenu() {
			System.out.println();
			System.out.println("========= MENU =========");
			System.out.println("|                      |");
			System.out.println("|   1. Add Numbers     |");
			System.out.println("|   2. Find Average    |");
			System.out.println("|   3. Calculate Tax   |");
			System.out.println("|   4. Exit            |");
			System.out.println("|                      |");
			System.out.println("========================");
			System.out.println();
		}

			}							
	
