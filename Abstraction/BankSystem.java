package AbstractAndInterface;

public abstract class BankSystem {
	
//	1. Bank System (Abstract Class)
//	Create an abstract class BankAccount with:
//	abstract method calculateInterest()
//	concrete method displayBalance()
//	Create child classes:
//	SavingAccount
//	CurrentAccount
//	Implement different interest logic.

	public abstract void  calculateIntrest(double amount,double rateOfIntrest, double time);
	
	public void displaybalance() {
		System.out.println("Display Balance from abstract class bank system");
	}
	
	

}
