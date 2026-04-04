package Encapsulation;

public class BankAccountMain {
	
	public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println("Current Balance: " + account.getBalance());
    }

}
