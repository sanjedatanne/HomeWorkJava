package hw11Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("\n-------- Sister --------");
		Sister sister = new Sister();
		sister.sister(39, 40, 54, "67", 83, 43);
		sister.sister(22, 30, 31, "50", 90);
		sister.sister(25, 74, 57, "47");
		sister.sister(50, 43, 62);

		System.out.println("\n-------- Niece --------");
		Niece niece = new Niece();
		niece.sister(29, 80, 43, "21", 65, 2);
		niece.sister(5, 75, 32, "87", 50);
		niece.sister(65, 47, 26, "8");
		niece.sister(28, 33, 21);
	
	}
}
