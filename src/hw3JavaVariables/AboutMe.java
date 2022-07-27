package hw3JavaVariables;

public class AboutMe {
	public String name; // Variable Declared
	public byte age = 126; // Variable Initialized
	public short myExpense = 18275;
	public int myMonthlyIncome = 1749587361;
	public long myBankBalance = 5274465687945847696l;
	public float myWeight = 2.384756f;
	public double myGPA = 4.365856873488273;
	public char sex = 'F';
	public boolean usCitizen = true;
	

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My age is:" + aboutMe.age + "\nMy monthly income is:" + aboutMe.myMonthlyIncome
				+ "\nMy GPA is:" + aboutMe.myGPA);
	}

}
