import java.util.Scanner;
public class Objective5Lab4 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String userNum = ("Please enter a number:");
		

		java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter a number");
        int intInput = keyboard.nextInt();
       


		if (intInput % 2 == 0 ) {
			System.out.println("The number is even");
		}
		else if (intInput % 2 == 1 ) {
			System.out.println("The number is odd");
		}
	}
}