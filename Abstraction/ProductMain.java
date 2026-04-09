package AbstractAndInterface;

public class ProductMain {
	
	public static void main(String args[]) {
		
		System.out.println("Welcome to electronics shop");
		Product p=new Electronics();
		p.getPrice();
		
		Discount d= new Electronics();
		d.applyDiscount();
		
		System.out.println("Welcome to Clothing shop");
		
		Product p1=new Clothing();
		p1.getPrice();
		
		Discount d1= new Clothing();
		d1.applyDiscount();
//		
		
	}

}
