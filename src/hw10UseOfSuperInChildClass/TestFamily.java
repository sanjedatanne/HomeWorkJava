package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		Daughter ahmed = new Daughter("Julia", 21);
		Father father= new Father("Abdul", 40, 'F', true);
		ahmed.daughterInfo("June", 21);
		ahmed.fatherInfo("Abdul", 40, 'M', true);
		System.out.println(ahmed.familyName);
	}

}
