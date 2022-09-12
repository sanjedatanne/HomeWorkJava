package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("This is from the biochemistry lab method");
	}
	public static void medicalSchool() {
		
	}
}
/*
 * . how many keywords are used for the inheritance in Java for Abstract Class?
 * 2 keywords: implement and extend Can an Abstract Class inherit other Abstract
 * Class or a regular class or interface by extends keyword? It can inherit only
 * one abstract or regular class by extends and more than one interface by
 * implement. How many inheritances is possible by an Abstract Class? Multiple
 * for interface and 1 abstract or regular class.
 * 
 */
