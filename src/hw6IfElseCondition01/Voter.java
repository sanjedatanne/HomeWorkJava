package hw6IfElseCondition01;

public class Voter {

	public static void main(String[] args) {
		int age = 20;

		if (age == 18) {
			System.out.println("I am a Voter.");
		}

		if (age < 18) {
			System.out.println("I am a not a Voter.");
		}

		if (age > 18) {
			System.out.println("I am a Voter.");
		}

		else {
			System.out.println("Please add a valid age.");
		}

	}
}
