package AbstractAndInterface;

public class PartTimeEmployee extends Employee{
	
	public void calculateSalary(int hours) {
		
		double salary=hours*600;
		System.out.println("Your Part time job Salary is : "+salary);
	}

}
