
package week1.DIllard;

public class Account {
	private double balance;
	private String accountNumber;
	private double interestRate = .02;

	public Account(double balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public void withdraw(double withdraw) {
		if (withdraw > this.balance) {
			System.out.println("Fail");
		} else {
			this.balance -= withdraw;

		}
	}

	public void deposit(double num) {
		this.balance += num;
	}

	public void addInterest() {
		this.balance += this.balance * interestRate;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

}
