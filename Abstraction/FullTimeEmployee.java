package AbstractAndInterface;

public class FullTimeEmployee extends Employee{
	
	public void calculateSalary(int hours) {
		
		double salary=hours*1200;
		System.out.println("Your Full time job  Salary is : "+salary);
		
		
	}

}
