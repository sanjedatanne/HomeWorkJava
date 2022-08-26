package hw9Abstraction;

public interface University extends College, Hospital {
	public void classSize();
	public void playGround();
	public void teacher();

	// public University() {}, interface does not allow constructor because
	// constructor is not provided by interface as class cannot be instantiated.

	public default void gymnasium() {
	}
	public static void library() {
	}
	/*
	 * i) how many keywords are used for the inheritance in Interface? Ans: 1
	 * keyword: extends Can an interface inherit other Interfaces, or a regular
	 * class or abstract class by extends key word? Ans: An Interface cannot inherit
	 * a regular class or abstract class. Only other interface classes. How many
	 * inheritance is possible? Ans: Multiple
	 */
}
