package Encapsulation;

public class CubeSquare {
	
	private int num;
	private int num2;
	
	public void setCube(int num) {
		 num=num*num*num;
		this.num=num;
		
	}
	
	public void getCube() {
		
		System.out.println("Cube : " +num);
	}
	public void setSquare(int num2) {
		 num2=num2*num2;
		this.num2=num2;
		
	}
	
	public void getSquare() {
		
		System.out.println("Square : " +num2);
	}

}
