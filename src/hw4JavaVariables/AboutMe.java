package hw4JavaVariables;

public class AboutMe {
	public String name; // variables declared
	public byte age; 
	public short myExpense;
	public int myMonthlyIncome;
	public long myBankBalance;
	public float myWeight;
	public double myGPA;
	public char sex;
	public boolean usCitizen;
	
//Constructor Declared 
public AboutMe() {
	System.out.println("This is all about us: ");
	
}

//method implemented 
public void aboutMe() {
	System.out.println("My Name is: " + name + "\nMy Age: " + age +  "\nMy Expense: " + myExpense
			+ "\nMy Monthly Income: " + myMonthlyIncome + "\nMy Bank Balance" + myBankBalance
			+ "\nMy Weight: " + myWeight + "\nMy GPA: " + myGPA +"\nSex: " + sex + "\nAm I US Citizen? Ans: " + usCitizen );
}

}
