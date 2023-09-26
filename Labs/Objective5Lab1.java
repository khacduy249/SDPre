import java.util.Scanner;
public class Objective5Lab1 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String num1 = "First number";
		String num2 = "Second number";

		java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("First number");
        int intInput = keyboard.nextInt();
        System.out.println(" >> " + intInput);

        java.util.Scanner scanner1 = new java.util.Scanner(System.in);
        System.out.println("Second number");
        int intInput1 = keyboard.nextInt();
        System.out.println(" >> " + intInput1);


		if (intInput > intInput1) {
			System.out.println(intInput + " " + "is greater than" + " " + intInput1);
		}
		else if (intInput1 > intInput) {
			System.out.println(intInput1 + " " + "is greater than" + " " + intInput);
		}
	}
}