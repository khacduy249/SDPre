import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String fname = "What is your first name?";
		String lname = "What is your last name?";
		String favoriteAnimal = "What is your favorite animal";
		String favoriteFood = "What is your favorite food?";
		String favoriteSong = "What is your favorite song?";

		java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("What is your first name?");
        String userInput = keyboard.nextLine();
        System.out.println(" >> " + userInput);

        java.util.Scanner scanner1 = new java.util.Scanner(System.in);
        System.out.println("What is your last name?");
        String userInput1 = keyboard.nextLine();
        System.out.println(" >> " + userInput1);

        java.util.Scanner scanner2 = new java.util.Scanner(System.in);
        System.out.println("What is your favorite animal?");
        String userInput2 = keyboard.nextLine();
        System.out.println(" >> " + userInput2);

        java.util.Scanner scanner3 = new java.util.Scanner(System.in);
        System.out.println("What is your favorite food?");
        String userInput3 = keyboard.nextLine();
        System.out.println(" >> " + userInput3);

        java.util.Scanner scanner4 = new java.util.Scanner(System.in);
        System.out.println("What is your favorite song?");
        String userInput4 = keyboard.nextLine();
        System.out.println(" >> " + userInput4);

        System.out.println(" My first name is " + userInput + ".");
        System.out.println(" My last name is " + userInput1 + ".");
        System.out.println(" My favorite animal is " + userInput2 + ".");
        System.out.println(" My favorite food is " + userInput3 + ".");
        System.out.println(" My favorite song is " + userInput4 + ".");
		
	}
}