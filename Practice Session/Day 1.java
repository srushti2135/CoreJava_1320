package practice;

public class loops {

	/*
	 * 1.menu driven program
	 * 
	 * write a program using switch case with do-while loop 1.print numbers 1-10
	 * 2.print even numbers 3.print odd numbers exit program should run until user
	 * selects exits
	 */
	/*
	 * public static void main(String args[]) {
	 * 
	 * int choice = 3;
	 * 
	 * switch (choice) {
	 * 
	 * case 1:
	 * 
	 * int i = 1; do { System.out.println(i); i++; } while (i <= 10);
	 * 
	 * break; case 2:
	 * 
	 * int a = 1; do { if (a % 2 == 0) { System.out.println(a); } a++; } while (a <=
	 * 20);
	 * 
	 * break;
	 * 
	 * case 3:
	 * 
	 * int b = 1; do { if (b % 2 == 1) { System.out.println(b); } b++; } while (b <=
	 * 20);
	 * 
	 * break;
	 * 
	 * 
	 * } }
	 */

	/*
	 * 2. write a program using while loop to find sum of digits of a number
	 * 
	 * example input 1234 output 10
	 */
	/*
	 public static void main(String args[]) {
	 
	  int num=1234; 
	  int sum=0;
	   int count=0;
	    while(num!=0) {
	  
	  
	  sum=num%10; 
	  count=sum+count; 
	  num=num/10;
	  
	  
	  } System.out.print(count); }
	  
	 */

	
	

	// write a program using while loop to print numbers 10 to 1
	/*
	 * public static void main(String args[]) {
	 * 
	 * int i=10;
	 *  while(i>=1) {
	 * 
	 * System.out.println(i);
	 *  i--; 
	 * } }
	 */

	/*
	 * month name using switch write a program to display month name using switch
	 * case. example 1-january 2-february
	 */
	/*
	 * public static void main(String args[]) {
	 * 
	 * int choice = 5; switch (choice) {
	 * 
	 * case 1: System.out.println("january"); break; case 2:
	 * System.out.println("February"); break; case 3: System.out.println("March");
	 * break; case 4: System.out.println("April"); break; case 5:
	 * System.out.println("May"); break; case 6: System.out.println("June"); break;
	 * case 7: System.out.println("July"); break; case 8:
	 * System.out.println("August"); break; case 9: System.out.println("September");
	 * break; case 10: System.out.println("October"); break; case 11:
	 * System.out.println("November"); break; case 12:
	 * System.out.println("December"); break; default:
	 * System.out.println("Invalid choice"); } }
	 */

	/*
	 * 5. check voting eligibility
	 * 
	 * Write a program to check whether a person is eligible for voting using
	 * if-else /*
	 * 
	 * 
	 */
	/*
	 * public static void main(String args[]) {
	 * 
	 * int age=4; if(age>=18) {
	 * System.out.println("Congratulations!!!!!!!!! You are eligible for vote");
	 * 
	 * }else { System.out.println("Sorry :( You are  not eligible for vote"); }
	 * 
	 * }
	 */

	/*
	 * 6. check leap year
	 * 
	 * Write a program to check whether a year is a leap year or not using if-else.
	 */
/*
	public static void main(String args[]) {

		int year = 2025;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

			System.out.println(year + "  it is leap year");

		} else {

			System.out.println(year + "  it is not a leap year");
		}
	}*/
	
	/*7. write a program using for loop to find factorial of a number 
	
	example: 5!=120*/
	/*
	public static void main(String args[]) {
		
		int fact=1;
		for(int i = 1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	*/
	
	//8. write a program using for loop to print A to Z
	/*
	public static void main (String args[]) {
		
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i);
		}
	}
	*/
	
/*	9. write a program using while loop to reverse a number
	
	example:
		input: 1234
		output: 4321
		*/
	/*
	public static void main (String args[]) {
		
		
			
			int num=12541852;
			
			while(num!=0) {
				
				int sum=0;
				int count=0;
				sum=num%10;
				count=sum+count;
				num=num/10;
				
				System.out.print(count);
				
				
			}
		
		
	}*/
	
	//10. write a program to count digits in a number
	
	public static void main(String args[]){
		 int num=12; 
		  int sum=0;
		   int count=0;
		    while(num!=0) {
		  
		  
		  sum=num%10; 
		  count++; 
		  num=num/10;
		  
		  
		  } System.out.print(count); 
		
		
		
	}
}
















