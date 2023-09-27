import java.util.Scanner;
public class Objective5Lab3 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String userNum = ("Please enter a number:");
		

		java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter a number");
        int intInput = keyboard.nextInt();
       


		if (intInput > 0 ) {
			System.out.println(intInput + " " + "is positive");
		}
		else if (intInput < 0 ) {
			System.out.println(intInput + " " + "is negative");
		}
		if (intInput == 0 ) {
			System.out.println(intInput + " " + "is 0");
		}
	}
}