import java.util.Scanner;

public class Objective9Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		printMenu();		
		
		while (true){
		
				int intInput1 = scanner.nextInt();
				if (intInput1 == 1) {
				System.out.println("Hello Human.");	
				printMenu();
				}

				int intInput2 = scanner.nextInt();
				if (intInput2 == 2) {
				System.out.println("Apple, Banna, Coconut.");
				printMenu();
				}

				int intInput3 = scanner.nextInt();
				if (intInput3 == 3) {
				System.out.println("Goodbye.");
				break;
				}	
		}
	}					
	public static void printMenu() {	
		System.out.println("______MENU______");
		System.out.println("1: Say Hello");
		System.out.println("2: List my favorite foods");
		System.out.println("3: Exit");
		System.out.println();
	}	

}

						

