package AbstractAndInterface;

public class EmployeeMain {
	
	public static void main(String args[]) {
		
		Employee e=new FullTimeEmployee();
		e.calculateSalary(12);
		Employee e1=new PartTimeEmployee();
		e1.calculateSalary(3);
		
	}

}
