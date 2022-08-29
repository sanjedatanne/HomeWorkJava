package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This is from the default constructor from father class");

	}

	// parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen, String familyName) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		this.familyName = familyName;
		System.out.println();
	}

	public void father() {
		System.out.println("This is void method from father class");

	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println( "Father Name: " + name + " Father Age: " + age + " Sex: " + sex + " US Citizen?: " + usCitizen);

	}
}
