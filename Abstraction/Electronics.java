package AbstractAndInterface;

public class Electronics extends Product implements Discount{
	
	
public  void getPrice() {
		
		System.out.println("Price is 1200");
		
	}
	
	public void applyDiscount() {
		System.out.println("Discount is 20%");
	}
	
	

}