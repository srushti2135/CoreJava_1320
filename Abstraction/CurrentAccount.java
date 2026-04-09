package AbstractAndInterface;

public class CurrentAccount extends BankSystem {
	
	public void calculateIntrest(double amount,double rateOfIntrest, double time) {
		double intrest=((amount*rateOfIntrest*time)/100);
		System.out.println("current account intreste is : "+intrest);
	}

}
