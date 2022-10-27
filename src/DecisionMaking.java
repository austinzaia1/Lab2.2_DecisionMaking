import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Hello! What is your name?");
			String answer;
			String name;
			name = scan.nextLine();
			do {
				int num;
				do {
					System.out.println("Thank you " + name + ". Enter a number 1-100: ");
					num = scan.nextInt();
				} while (num < 1 || num > 100);

				if (num % 2 != 0 && num < 60) {
					System.out.println(+num + " and Odd.");
				} else if (num % 2 == 0 && num <= 25 && num >= 2) {
					System.out.println("Even and less than 25, " + name + ".");
				} else if (num % 2 == 0 && num <= 60 && num >= 26) {
					System.out.println("Even");
				} else if (num % 2 == 0 && num > 60) {
					System.out.println(+num + " and Even");
				} else if (num != 0 && num > 60) {
					System.out.println(+num + " Odd and over 60");
				}
				System.out.println("Continue? (yes/no): ");
				answer = scan.next();
			} while (answer.equalsIgnoreCase("yes"));
		}
	}
}