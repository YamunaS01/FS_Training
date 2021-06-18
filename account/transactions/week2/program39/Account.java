package account.transactions.week2.program39;

import java.util.Scanner;

public class Account {

	private String accountNumber;

	private int balance;

	Account(String accountNo, int balanceCheck) {

		accountNumber = accountNo;

		balance = balanceCheck;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int transactionAmount) {

		balance = balance + transactionAmount;
		System.out.println("Your balance after the deposit is  : " + balance);

	}

	public void withdraw(int transactionAmount) {

		if (balance > transactionAmount) {
			balance = balance - transactionAmount;
			System.out.println("Your balance after the withdraw is  : " + balance);
		}else
		{
			System.out.println("Insufficient Balance, Your balance after the transaction is:   " + balance);
		}

	}

	public static void main(String args[]) {

		int number;

		int depositValue;

		int withdrawValue;

		Account account1 = new Account("1000321", 5000);

		System.out.println("Enter the Account Number : " + account1.getAccountNumber());

		System.out.println("Enter the Account Balance : " + account1.getBalance());

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 for deposit an amount or Enter 2 for withdraw an amount : ");

		number = sc.nextInt();

		if (number == 1) {
			System.out.println("Enter the amount to deposit : ");
			depositValue = sc.nextInt();
			account1.deposit(depositValue);
			
		} else {
			System.out.println("Enter the amount to withdraw : ");
			withdrawValue = sc.nextInt();
			account1.withdraw(withdrawValue);
		}

	}
}
