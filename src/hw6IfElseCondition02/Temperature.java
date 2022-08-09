package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Please put your value here: ");
		Scanner scanner = new Scanner(System.in);
		int temp1 = scanner.nextInt();

		if (temp1 < 32) {
			System.out.println("Freezing ");
		} else if (temp1 < 55) {
			System.out.println("Pleasant");
		} else if (temp1 < 73) {
			System.out.println("Getting Warmer");
		} else if (temp1 < 101) {
			System.out.println("Hot");
		} else if (temp1 > 101) {
			System.out.println("Ice on my Head Please");
		}

		scanner.close();
	}
}
