package AbstractAndInterface;

public class BankMain {
	
	public static void main(String args[]) {
		
		BankSystem b= new SavingAccount();
		b.displaybalance();
		b.calculateIntrest(12000,5,2);
		
		System.out.println("-------------------------");
		
		BankSystem b1= new CurrentAccount();
		b1.displaybalance();
		b1.calculateIntrest(15000,6,3);
		
		
	}

}
