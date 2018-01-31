package week1.DIllard;

public class CheckingAccount extends Account {
	private int numOfChecks;
	
	public CheckingAccount(String accountNumber) {
		super(0, accountNumber);
	}
	
	public CheckingAccount(double balance, String accontNumber) {
		super(balance, accontNumber);
		
	}

	@Override
	public void withdraw(double same) {
		
		if(numOfChecks < 3) {
			super.withdraw(same);
			this.numOfChecks++;
		}
		else {
			super.withdraw(same + 3);
		}
		
	}

	

	
}
