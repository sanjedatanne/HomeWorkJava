package hw9Abstraction;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class ColumbiaUniversity extends MedicalSchool {
	/*
	 * public abstract void chemistry(); Regular class does not allow abstract
	 * methods because a regular class can be instantiated whereas, any class with
	 * an abstract method is an abstract class that can't be instantiated.
	 */
	public void biology() {
		System.out.println("This is from the biology method");
	}
	public ColumbiaUniversity() {
		
	}
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
}

/*
 * how many keywords are used for the inheritance in Java for a regular Class? 2
 * keywords: extend and implement. Can a regular Class inherit other Abstract
 * Class or a regular class or interface by extends key word? Regular class can
 * inherit either one abstract or regular class by extends keyword and multiple
 * interface classes by implement keyword. How many inheritances is possible by
 * a regular Class? Multiple for interface and either 1 of regular or abstract
 * class.
 */
