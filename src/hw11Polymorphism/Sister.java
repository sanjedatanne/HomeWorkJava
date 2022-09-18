package hw11Polymorphism;

/*Method Overloading is when different methods exist with the same method name but with different parameters or signature, it is called method overloading. Method
 * Overloading occurs during compile time.
 * It is also known as  Static Polymorphism or early binding or method overloading or compile time polymorphism.
 * It happens in compile time. 
*/
public class Sister {
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("This is void type method: " + total1);
	}

	public int sister(int age1, int age2, int age3, String age4, int age5) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("This return type method: " + total2);
		return total2;
	}

	public static int sister(int age1, int age2, int age3, String age4) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("This static type method: " + total3);
		return total3;
	}

	public final int sister(int age1, int age2, int age3) {
		int total4 = age1 + age2 + age3;
		System.out.println("This final type method: " + total4);
		return total4;
	}
}
