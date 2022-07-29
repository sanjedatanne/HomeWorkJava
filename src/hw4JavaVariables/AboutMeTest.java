package hw4JavaVariables;

public class AboutMeTest {
	public static void main (String [] args) {
		AboutMe aboutMe = new AboutMe(); //Constructor initialized 
		aboutMe.name = "Sanjeda Tanne"; // variables initialized 
		aboutMe.age = 20; 
		aboutMe.myExpense = 17372;
		aboutMe.myMonthlyIncome = 1579586370;
		aboutMe.myBankBalance = 425425687945847695l;
		aboutMe.myWeight = 3.254758f;
		aboutMe.myGPA = 2.465856873488694;
		aboutMe.sex = 'F';
		aboutMe.usCitizen = true;
		aboutMe.aboutMe(); //method initialized 
		
		System.out.println("\n---------------------------------------\n");
		AboutMe aboutMe2 = new AboutMe(); //Constructor  initialized 
		aboutMe2.name = "Alex"; // variables  initialized 
		aboutMe2.age = 22; 
		aboutMe2.myExpense = 19372;
		aboutMe2.myMonthlyIncome = 1879546300;
		aboutMe2.myBankBalance = 575425687945847695l;
		aboutMe2.myWeight = 2.654758f;
		aboutMe2.myGPA = 3.905856873488694;
		aboutMe2.sex = 'M';
		aboutMe2.usCitizen = false;
		aboutMe2.aboutMe();//method initialized 
		
		

		
		
		
				
	}
	
}
