import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String num1 = "Please enter the first whole number you would like to add.";
		String num2 = "Please enter the second whole number you would like to add.";
		String num3 = "Please enter the third whole number you would like to add.";


		String dub1 = "Please enter the first decimal number you would like to add.";
		String dub2 = "Please enter the second decimal number you would like to add.";
		String dub3 = "Please enter the third decimal number you would like to add.";	

		java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter the first whole number you would like to add.");
        int intInput = keyboard.nextInt();
        System.out.println(" >> " + intInput);

        java.util.Scanner scanner1 = new java.util.Scanner(System.in);
        System.out.println("Please enter the second whole number you would like to add.");
        int intInput1 = keyboard.nextInt();
        System.out.println(" >> " + intInput1);

        java.util.Scanner scanner2 = new java.util.Scanner(System.in);
        System.out.println("Please enter the third whole number you would like to add.");
        int intInput2 = keyboard.nextInt();
        System.out.println(" >> " + intInput2);

        java.util.Scanner scanner3 = new java.util.Scanner(System.in);
        System.out.println("Please enter the first decimal number you would like to add.");
        double doubleInput = keyboard.nextDouble();
        System.out.println(" >> " + doubleInput);

        java.util.Scanner scanner4 = new java.util.Scanner(System.in);
        System.out.println("Please enter the second decimal number you would like to add.");
        double doubleInput1 = keyboard.nextDouble();
        System.out.println(" >> " + doubleInput1);

        java.util.Scanner scanner5 = new java.util.Scanner(System.in);
        System.out.println("Please enter the third decimal number you would like to add.");
        double doubleInput2 = keyboard.nextDouble();
        System.out.println(" >> " + doubleInput2);

    System.out.println("The sum of "  +  intInput  + " + " + intInput1  + " + " +  intInput2 +  " = " + (intInput + intInput1 + intInput2));
	System.out.println("The sum of "  +  doubleInput  + " + " +  doubleInput1  + " + " +  doubleInput2 +  " = " + (doubleInput + doubleInput1 + doubleInput2));

	}

}
