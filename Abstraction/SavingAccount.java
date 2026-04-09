package AbstractAndInterface;

public class SavingAccount extends BankSystem {
	
	public void calculateIntrest(double amount,double rateOfIntrest, double time) {
		double intrest=((amount*rateOfIntrest*time)/100);
		System.out.println("saving account intreste is : "+intrest);
	}

}
