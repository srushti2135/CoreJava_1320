package localGlobal;

public class Hospital {
	
	static String hospital_Name = "Aadarsh Hospital";
	static int patient_id =123;
	static int total_patient ;
	static int total_doctors = 5;
	static String doctor_name="Ram";
	static boolean cancer_Patient;
	
	
	public static void main(String args[]) {
		
		System.out.println("Hospital Name : "+hospital_Name);
		System.out.println("Pateint Id : "+patient_id);
		System.out.println("Total Patient : "+total_patient);
		System.out.println("Total Doctors : "+total_doctors);
		System.out.println("Doctor Name : "+doctor_name);
		System.out.println("Cancer Patient : "+cancer_Patient);
		
	}
	

}
