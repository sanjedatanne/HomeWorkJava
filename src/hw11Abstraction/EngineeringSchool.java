package hw11Abstraction;

public abstract class EngineeringSchool extends NYUniversity {
	public abstract void mechanicalLab();
	public void computerLab() {
		System.out.println("This is from the computer lab method");
	}
	public EngineeringSchool() {
	}
}
