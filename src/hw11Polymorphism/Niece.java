package hw11Polymorphism;

public class Niece extends Sister {

	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("This is void type method: " + total1);
	}
	@Override
	public int sister(int age1, int age2, int age3, String age4, int age5) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("This return type method: " + total2);
		return total2;

	}
}

/*
 * @Override 
 * public static int sister(int age1, int age2, int age3, String age4){ 
 * int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
 * System.out.println("This static type method: " + total3); return total3; 
 * }
 * 
 * If you remove "@Override" then the this method will work but it will take it as it's own method for this (Niece) class. 
 * We cannot override static methods in Java. Static methods are bonded at compile time using static binding.
 * 
 * @Override public final int sister(int age1, int age2, int age3) { 
 * int total4 = age1 + age2 + age3; System.out.println("This final type method: " +
 * total4); return total4; 
 * } 
 * 
 * Final method can not be overriden at all because the purpose of final method is that it cannot be changed or overridden.
 * 
 */
