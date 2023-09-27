import java.util.Scanner;

public class Objective7Lab5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		while (true) {
			System.out.println("______MENU______");
			System.out.println("1: Say Hello");
			System.out.println("2: List my favorite foods");
			System.out.println("3: Exit");
			

				int intInput1 = scanner.nextInt();
				if (intInput1 == 1) {
				System.out.println("Hello World.");	
				}

				int intInput2 = scanner.nextInt();
				if (intInput2 == 2) {
				System.out.println("Apple, Banna, Coconut.");
				}

				int intInput3 = scanner.nextInt();
				if (intInput3 == 3) {
				System.out.println("Goodbye, see you later.");
				break;
				}			

		}
	}
}
