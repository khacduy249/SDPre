import java.util.Scanner;
public class Objective4Lab3 {
	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);

		String age = "How old are you?";
		String currentyear = "Current year";


		java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("How old are you?");
        int intInput = keyboard.nextInt();
        System.out.println(" >> " + intInput);

        java.util.Scanner scanner1 = new java.util.Scanner(System.in);
        System.out.println("Current year");
        int intInput1 = keyboard.nextInt();

    System.out.println(" You were born in " + (intInput1 - intInput));
    

	}
}
