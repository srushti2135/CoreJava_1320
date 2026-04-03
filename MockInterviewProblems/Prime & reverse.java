package loop.com;

public class prime {
	public static void main(String args[]) {
		
	
		int num;
		int original=0;
		for(num=200;num<=300;num++) {
			int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
					if(count==2) {
			System.out.println(num);
			
		int num2=num;
		while(num2!=0) {
				int reverse=0;
				int remainder=num2%10;
				reverse=reverse*10+remainder;
				num2=num2/10;
				System.out.print(reverse);
		}System.out.println();
		System.out.println("------------------------------------");
			}
		
				
				}
	}
}
