package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("John");
		employee.setAge(32);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Employee Name: " + employee.getName() + ", \nAge: " + employee.getAge() + ", \nSex: "
				+ employee.getSex() + ", \nUS Citizen? : " + employee.isUsCitizen());

	}

}
