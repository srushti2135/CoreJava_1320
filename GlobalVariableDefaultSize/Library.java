package localGlobal;

public class Library {
	
	
	  
	   static int libraryId = 201;
	   static String libraryName = "Central Library";
	   static String libraryLocation = "Pune";
	   static long libraryContactNo = 9876543210L;
	   static double membershipFee = 500.50;
	    
	    
	   static  int totalBooks;           
	   static String librarianName;     
	   static boolean isOpen;   
	   
	   public static void main(String args[]) {
	        
	       
	        
	        System.out.println("Library ID : " + libraryId);
	        System.out.println("Library Name : " + libraryName);
	        System.out.println("Library Location : " + libraryLocation);
	        System.out.println("Library Contact Number : " + libraryContactNo);
	        System.out.println("Membership Fee : " +membershipFee);
	        
	    
	        System.out.println("Total Books : " + totalBooks);
	        System.out.println("Librarian Name : " +librarianName);
	        System.out.println("Is Library Open : " + isOpen);
	    }
	}


