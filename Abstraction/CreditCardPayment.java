package AbstractAndInterface;

public class CreditCardPayment implements Payment {
	
	public void pay(double amount) {
		System.out.println("Your Payment of "+amount+"Rs. Successful through Credit card");
	}

}
