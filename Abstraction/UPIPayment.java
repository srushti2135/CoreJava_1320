package AbstractAndInterface;

public class UPIPayment implements Payment {
	
	public void pay(double amount) {
		System.out.println("Your Payment of "+amount+"Rs. Successful through UPI Payment");
	}

}
