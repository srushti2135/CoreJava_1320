package AbstractAndInterface;

public class Clothing extends Product implements Discount{
	
	public  void getPrice() {
		
		System.out.println("Clothing price is 1200");
		
	}
	
	public void applyDiscount() {
		System.out.println("Discount is 20%");
	}
	

}
