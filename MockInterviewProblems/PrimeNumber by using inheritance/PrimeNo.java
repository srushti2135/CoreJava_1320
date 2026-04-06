package Inheritance;

public class PrimeNo extends Prime {
	
	public void isPrime(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			
			System.out.println("Number is prime : "+num);
			
		}else {
			System.out.println("Number is not prime : " +num);
		}
	}

}
