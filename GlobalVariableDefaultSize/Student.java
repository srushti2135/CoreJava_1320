package localGlobal;

public class Student {
	
	static int std_id = 123;
	static String name = "Srushti";
	static short seatNumber = 23346;
	static int pinCode ;
	 static long adharNo = 232345678908634l;

	 static float height = 6.5f;
	 static double marks = 99.99;

	 static boolean checkPassed;
	
	public static void main(String args[]) {
		
		System.out.println("Student id : "+std_id);
		System.out.println("Student name : "+name);
		System.out.println("Student Seat Number : "+seatNumber);
		System.out.println("Student pincode : "+pinCode);
		System.out.println("Student Aadhar card  : "+adharNo);
		System.out.println("Student height : "+height);
		System.out.println("Student Marks : "+marks);
		System.out.println("Student Result : "+checkPassed);
		
	}

}
