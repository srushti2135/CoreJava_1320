package localGlobal;

public class Employee {
	
	static int emp_id=12;
	static String emp_name="Sita";
	static int emp_experience;
	static float emp_salary=4.5f;
	static String emp_specification = "Java Developer";
	static boolean emp_IT_NONIT;
	
	public static void main(String args[]) {
		
		System.out.println("Employee ID : "+emp_id);
		System.out.println("Employee Name : "+emp_name);
		System.out.println("Employee Experience : "+emp_experience);
		System.out.println("Employee Salary : "+emp_salary);
		System.out.println("Employee Specification : "+emp_specification);
		System.out.println("Employee belongs in IT or Not : "+emp_IT_NONIT);
		
		
		
	}
	
	

}
