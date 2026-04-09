package AbstractAndInterface;

public class Triangle extends Shape{
	
	public void area() {
		int base=100;
		int height=20;
		int area=(1/2)*base*height;
		System.out.println("Area of Triangle : "+area);
	}

}
