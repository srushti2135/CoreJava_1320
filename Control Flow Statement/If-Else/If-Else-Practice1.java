package ifelse.com;

public class IfElsePractice {

  //Write a program that checks if a person’s age is greater than 18, then print "Adult".
	/*public static void main(String args[]) {
		
		int age = 1;
		
		if(age>=18) {
			
			System.out.println("Adult!!!");
		}
	}*/

  //Write a program to check whether a number is divisible by 10.
  
	/*public static void main(String args[]) {
		
		int num=50;
		if(num%10==0) {
			System.out.println("Above number is divislble by 10 : "+num);
		}else {
			System.out.println("Above number is not divislble by 10 : "+num);
		}
	}*/

  //Write a program to check whether a temperature is above 30°C, then print "Hot Day".
  
	/*public static void main(String args[]) {
		
		int temp = 35;
		
		if(temp>=30){
			
			System.out.println("Hot Day!!!!");
			
			
		}
				
		
	}*/

  //Write a program to check whether a number is even or odd. 
  
	/*public static void main(String args[]) {
	
	int num=12345;
	
	if(num%2==0) {
		
		System.out.println("Number is Even : "+num);
		
	}else {
		System.out.println("Number is Odd : "+num);
	}
}

}*/

  //Write a program to check whether a given year is leap year or not.
  
	/*public static void main(String args[]) {
		
		int year=2025;
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			
			System.out.println(year+"  it is leap year");
			
		}else {
			 
			System.out.println(year+"  it is not a leap year");
		}
	}*/

  //Write a program to check whether a number is positive or negative.
  
	/*public static void main(String args[]) {
	
	int num=-542;
	
	if(num>=0) {
		
		System.out.println("Given Number is positive");
	}else {
		System.out.println("Given Number is negative");
	}
}*/
	
 /*Write a program to find grade of a student based  on marks:
90–100 → Grade A
75–89 → Grade B
50–74 → Grade C
35–49 → Grade D
Below 35 → Fail*/

  
	/*public static void main(String args[]) {
		
		int marks=75;
		
		if(marks<=100 && marks>=90) {
			
			System.out.println("Grade A");
		}else if(marks<=90 && marks>=75) {
			
			System.out.println("Grade B");
		}else if(marks<=74 && marks>=50) {
			
			System.out.println("Grade C");
		}else if(marks<=49 && marks>=35) {
			
			System.out.println("Grade D");
		}else  {
			
			System.out.println("Sorry :( You are Fail");
		}
	}*/

  //Write a program to print the day of the week based on day number (1–7).
  
/*public static void main(String args[]) {
		
		int day=5;
		
		if(day==1) {
			
			System.out.println("Monday");
		}else if(day==2) {
			
			System.out.println("Tuesday");
		}else if(day==3) {
			
			System.out.println("Wendsday");
		}else if(day==4) {
			
			System.out.println("Thursday");
		}else if(day==5) {
			
			System.out.println("Friday");
		}else if(day==6) {
			
			System.out.println("Saturday");
		}else if(day==7){
			
			System.out.println("Sunday");
		}else {
			System.out.println("Invalid input!!!!!!!");
		}
	}*/

  //Write a program to check the type of triangle (Equilateral, Isosceles, or Scalene).
  
	/*public static void main(String args[]) {
		
		int side1=3;
		int side2=3;
		int side3=2;
		
		if(side1 == side2 && side2 == side3) {
			
			System.out.println("Equilateral Triangle");
			
		}else if(side1 == side2 || side2 == side3 || side1 == side3) {
			
			System.out.println("Isosceles Triangle");
			
		}else{
			
			System.out.println("Scalene Triangle");
			
		}
	}*/

  /*Write a program to print a message based on age group:

0–12 → Child
13–19 → Teenager
20–59 → Adult
60+ → Senior Citizen */

  
	/*public static void main(String args[]) {
		
		int age=20;
		
		if(age>=0 && age<=12) {
			
			System.out.println("Child");
		}else if(age>=13 && age<=19) {
			
			System.out.println("Teenager");
		}else if(age>=20 && age<=59) {
			
			System.out.println("Adult");
		}else {
			
			System.out.println("Citizen");
		} 
	}*/

  //Write a program to classify a temperature as Hot, Warm, Cool, or Cold.
  
	/*public static void main(String args[]) {
		
		int temperature = 9;
		
		if (temperature >= 30) {
            System.out.println("Hot");
        } 
        else if (temperature >= 20) {
            System.out.println("Warm");
        } 
        else if (temperature >= 10) {
            System.out.println("Cool");
        } 
        else {
            System.out.println("Cold");
        }
		
	}*/

  //Write a program to check whether a number is positive, negative, or zero.
  
	/*public static void main(String args[]) {
	
	int num=09;
	
	if(num>0) {
		
		System.out.println("Given Number is positive");
	}else if(num==0) {
		System.out.println("Given Number is neither negative or positive");
	}else {
		System.out.println("Given Number is negative");
	}
}*/

  //Write a program to check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).
  
/*public static void main(String args[]) {
		
		int age=25;
		if(age>=18) {
			
			System.out.println("Congratulations!!!!!!!!!!! you are eligible for vote");
			if(age>=25) {
				System.out.println("Congratulations!!!! Now you are eligibal to participate as a contest");
			}
		}else {
			System.out.println("Sorry :( You are not eligible for vote");
		}
	
	}*/

  //Write a program to check if a year is leap year, and if leap, check if it’s a century year.
  
	/*public static void main(String args[]) {
		
		int year = 345;
		
		 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println("It is a Leap Year");

	            if (year % 100 == 0) {
	                System.out.println("It is also a Century Year");
	            } else {
	                System.out.println("It is not a Century Year");
	            }
	        } else {
	            System.out.println("It is not a Leap Year");
	        }
	}*/

  //Write a program to check whether a number is even, and if even, check whether it’s greater than 50.
	
/*public static void main(String args[]) {
		
		int num=250;
		if(num%2==0) {
			
			System.out.println("Even number "+num);
			if(num>=50) {
				System.out.println("Number is greater than 50");
			}
		}
	
	}*/
	
	
	
	
	
}
