package week1.DIllard;

public class SavingsAccount extends Account {
	private double minBalance = 100;
	
	public SavingsAccount(String accountNumber) {
		super(0, accountNumber);
	}
	
	public SavingsAccount(double balance, String accontNumber) {
		super(balance, accontNumber);
		
	}
	
	@Override
	public void addInterest() {
		if(this.getBalance()>=100 ) {
			this.addInterest();
		}
		
	}
	


}
