package Encapsulation;

public class BankAccount {
	/*
	 * 2. Bank Account – deposit & withdraw

Question:
Create a BankAccount class with a private balance.
Add:
deposit(double amount)
withdraw(double amount)
getBalance()
	 */


	    // Private variable (Encapsulation)
	    private double balance;

	    // Constructor (optional - initializes balance to 0)
	    public BankAccount() {
	        balance = 0.0;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid amount");
	        }
	    }

	    // Method to check balance
	    public double getBalance() {
	        return balance;
	    }
	

}
