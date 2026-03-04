package operator.com;

public class complexoperatoreg {
	
	public static void main(String args[]) {
		
		/*int a = 5;
		System.out.println(a++ + ++a); //12
		System.out.println(a);//7
		*/
		
		/*int x = 10;
		int y = x++ + --x + ++x;
		System.out.println(y);//31
		System.out.println(x);//11
		*/
		
		/*int a = 8;
		a += a++ + ++a;
		System.out.println(a);//26
		*/
		
		/*int i = 4;
		int result = i++ * 2 + --i * 3;
		System.out.println(result);//20
		System.out.println(i);//4
		*/
		
		/*int a = 6;
		int b = 3;
		a *= ++b + a--;
		System.out.println(a);//60
		System.out.println(b);//4
		*/
		
		/*int x = 9;
		x = x++ - --x + ++x;
		System.out.println(x);//10
		*/
		
		/*int a = 7;
		int b = 2;
		int c = a++ % b + --a * b++;
		System.out.println(c);//15
		System.out.println(a);//7
		System.out.println(b);//3
		
		*/
		
		/*int i = 5;
		int j = i++ + i-- + ++i;
		System.out.println(j);//17
		System.out.println(i);//6
		*/
		
		/*int a = 10;
		a %= 3;
		a += ++a + a--;
		System.out.println(a);//5
		*/
		
		
		
		int x = 3;
		int y = 4;

		int z = x++ * --y + ++x - y++ + x % 3;

		System.out.println(z);//13
		System.out.println(x);//5
		System.out.println(y);//4
		
		
		
	}

}
