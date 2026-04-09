package AbstractAndInterface;

public class PaymentMain {

	public static void main(String args[]) {
		
		Payment p=new CreditCardPayment();
		p.pay(1200);
		
		Payment p1=new UPIPayment();
		p1.pay(1300);
		
		Payment p2 =  new NetBanking();
		p2.pay(1500);
	}
}
