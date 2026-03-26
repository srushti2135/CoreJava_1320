package constructor;

public class Employee {
	
public Employee(String fname,String lname,int age,String gender,String email) {
		
		System.out.println("First Name  : "+fname);
		System.out.println("Last Name  : "+lname);
		System.out.println("Age  : "+age);
		System.out.println("Gender  : "+gender);
		System.out.println("Email id  : "+email);
	}
	
	public void salary(){
		
		int salary =45000;
		if(salary>25000) {
			System.out.println("Salary : "+salary);
		}
		
	}

}
