package switchcase;

public class switchcasepractice1 {
	
	/*1. Print Day Name

	Write a program to print the day name using a number.

	Example
	1 → Monday
	2 → Tuesday
	
	public static void main(String args[]) {
		
		int day=5;
		
		switch(day) {
		
		case 1:
			System.out.println("Monady");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Thursday");
			break;
		case 4:
			System.out.println("Friday");
			break;
		case 5:
			System.out.println("Saturday");
			break;
		case 6:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Invalid input");
		}
	}*/
	
	/*2. Print Month Name

Write a program to print month name based on number (1–12).

Example
1 → January
2 → February

	
public static void main(String args[]) {
		
		int month=5;
		
		switch(month) {
		
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Agust");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("Noveber");
			break;
		case 12:
			System.out.println("December");
			break;
			default:
				System.out.println("Invalid input");
		}
	}*/
	
	
	/*Create a calculator using switch case for operations:

		1 → Addition
		2 → Subtraction
		3 → Multiplication
		4 → Division
		4. Vowel or Consonant */
	
	

	   /* public static void main(String[] args) {

	        int num1 = 10;
	        int num2 = 5;
	        int choice = 1;   // 1=Addition, 2=Subtraction, 3=Multiplication, 4=Division

	        switch(choice) {

	            case 1:
	                System.out.println("Addition = " + (num1 + num2));
	                break;

	            case 2:
	                System.out.println("Subtraction = " + (num1 - num2));
	                break;

	            case 3:
	                System.out.println("Multiplication = " + (num1 * num2));
	                break;

	            case 4:
	                System.out.println("Division = " + (num1 / num2));
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }
	    
	}*/
	
	
	  /*  
	   * Write a program to check whether a character is a vowel or consonant using switch.

Example
a,e,i,o,u → Vowel
	   *
	    public static void main(String[] args) {
	    

	        char ch = 'a';

	        switch(ch) {

	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	            case 'A':
	            case 'E':
	            case 'I':
	            case 'O':
	            case 'U':
	                System.out.println("It is a Vowel");
	                break;

	            default:
	                System.out.println("It is a Consonant");
	        }
	    }*/
	
	/*Grade System

	Write a program to print grade description.

	A → Excellent
	B → Good
	C → Average
	D → Pass
	F → Fail*/
	
	/*public static void main (String args[]) {
		
		char grade= 'A';
		
		switch(grade) {
		
		case 'A' :
			System.out.println("Excellent");
			break;
		case 'B' :
			System.out.println("Good");
			break;
		case 'C' :
			System.out.println("Average");
			break;
		case 'D' :
			System.out.println("Pass");
			break;
		case 'F' :
			System.out.println("Fail");
			break;
			default:
				System.out.println("Invalid Input !!!!!!!!!!!!");
			
			
		
		
		}
	}*/
	
	
	
	/*/6. Even or Odd

	Write a program to check even or odd using switch case.

	Hint: use number % 2
	*/
	
	
	/*public static void main(String args[]) {
		
		int num=23;
		
		switch(num%2) {
		
		case 0:
			System.out.println("Number is even");
			break;
		case 1:
			System.out.println("Number is odd");
			break;
			default:
				System.out.println("Invalid Input !!!!!!!!!!!!");
				
		}
	}*/
	
	/*7. Menu Driven Program

	Create a menu like:

	1 → Login
	2 → Register
	3 → Profile
	4 → Logout*/
	
	/*public static void main(String[] args) {

        
        int choice = 1;   

        switch(choice) {

            case 1:
                System.out.println("Login");
                break;

            case 2:
                System.out.println("Register");
                break;

            case 3:
                System.out.println("Profile");
                break;

            case 4:
                System.out.println("Logout");
                break;

            default:
                System.out.println("Invalid choice");
        }
    
}
	*/
	
	/*8. Print Week Type

	Check if the day is Weekend or Weekday.

	Example

	1–5 → Weekday
	6–7 → Weekend*/
	/*
public static void main(String[] args) {

        
        int choice = 4;   

        switch(choice) {

            case 1,2,3,4,5:
                System.out.println("Weekday");
                break;

            case 6,7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid choice");
        }
    
}*/
	/*10. Area Calculator

	Calculate area using switch.

	1 → Circle
	2 → Rectangle
	3 → Square*/
/*	
public static void main(String[] args) {

        
        int choice = 2;   

        switch(choice) {

            case 1:
            	int radius=2;
            	double areacircle=3.14*radius*radius;
                System.out.println(areacircle);
                break;

            case 2:
            	int length=10;
            	int breadth=12;
            	int arearectangle=length*breadth;
                System.out.println(arearectangle);
                break;
                
            case 3:
            	int side=4;
            	int areasquare=side*side;
                System.out.println(areasquare);
                break;
                
                
            default:
                System.out.println("Invalid choice");
        }
    
}*/
	
	/*11. Print Language Name

	Input language code and print name.

	1 → Java
	2 → Python
	3 → C++
	4 → JavaScript*/
	/*
public static void main(String[] args) {

        
        int choice = 1;   

        switch(choice) {

            case 1:
                System.out.println("java");
                break;

            case 2:
                System.out.println("Python");
                break;

            case 3:
                System.out.println("C++");
                break;

            case 4:
                System.out.println("JavaScript");
                break;

            default:
                System.out.println("Invalid choice");
        }
    
}*/
	
	/*13. Print Number in Words

	Convert numbers into words.

	1 → One
	2 → Two
	3 → Three
	4 → Four
	5 → Five*/
/*	
public static void main(String[] args) {

        
        int choice = 3;   

        switch(choice) {

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            default:
                System.out.println("Invalid choice");
        }
    
}*/
	
	/*14. Student Department

Print department name.

1 → Computer Science
2 → Mechanical
3 → Civil
4 → Electrical*/
/*	
public static void main(String[] args) {

        
        int choice = 3;   

        switch(choice) {

            case 1:
                System.out.println("Computer Science");
                break;

            case 2:
                System.out.println("Mechanical");
                break;

            case 3:
                System.out.println("Civil");
                break;

            case 4:
                System.out.println("Electrical");
                break;

            default:
                System.out.println("Invalid choice");
        }
    
}
	*/
	
	/*15. Season Finder

	Print season based on month number.

	Example

	12,1,2 → Winter
	3,4,5 → Summer
	6,7,8 → Monsoon*/
	/*
public static void main(String[] args) {

        
        int choice = 3;   

        switch(choice) {

            case 12,1,2:
                System.out.println("Winter");
                break;

            case 3,4,5:
                System.out.println("Summer");
                break;

            case 6,7,8:
                System.out.println("Monsoon");
                break;

            
            default:
                System.out.println("Invalid choice");
        }
    
}*/
	
/*	16. Mobile Menu

	Create a mobile settings menu.

	1 → WiFi
	2 → Bluetooth
	3 → Mobile Data
	4 → Airplane Mode*/
	
	/*
	
public static void main(String[] args) {

        
        int choice = 3;   

        switch(choice) {

            case 1:
                System.out.println("Winter");
                break;

            case 3,4,5:
                System.out.println("Summer");
                break;

            case 6,7,8:
                System.out.println("Monsoon");
                break;

            
            default:
                System.out.println("Invalid choice");
        }
    
}
	*/
	
}












































