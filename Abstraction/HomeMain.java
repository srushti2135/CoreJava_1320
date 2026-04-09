package AbstractAndInterface;

public class HomeMain {
	
	public static void main(String args[]) {
		
		Home h=new Home();
		h.control(new Light());
		h.control(new Fan());
		h.control(new AC());
		
	}

}
