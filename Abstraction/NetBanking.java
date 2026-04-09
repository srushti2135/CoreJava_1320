package AbstractAndInterface;

public class NetBanking implements Payment {
	
	public void pay(double amount) {
		System.out.println("Your Payment of "+amount+"Rs. Successful through Net Banking");
	}

}
