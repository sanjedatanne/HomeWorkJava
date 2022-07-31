package hw5Q2Constructor;


public class Computer {
	public String brand;
	public String model;
	public String operatingSytem;
	public String price;
	public char grade;
	public boolean madeInUSA;
	
	
	public Computer() {
	System.out.println("This is from default Constructor of Computer class.");
	}

	public Computer(String brand, String model, String operatingSytem, String price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSytem = operatingSytem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand:" + brand + " Model is:" + model + " Operating Sytem:" +operatingSytem + " Price:" + price + " Grade:" + grade + " Made in USA?" + madeInUSA);
		
		
	
	}

}
