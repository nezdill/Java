package week1.DIllard;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestAccountsCh11NoExceptions
{
	@Rule
	  public final ExpectedException exception = ExpectedException.none();

	
	@Test
	public void testCheckingCreation()
	{
		CheckingAccount a1;
		try
		{
			a1 = new CheckingAccount(500.00, "123");
			// default balance = 0.00
			CheckingAccount a2 = new CheckingAccount("999");
			
			assertEquals(500.00,a1.getBalance(),2);
			assertEquals(00,a2.getBalance(),2);
		}
		catch (Exception e)
		{
			fail();
		}
				
	}
	
	
	@Test
	public void testCheckingDeposit()
	{
		CheckingAccount a1;
		try
		{
			a1 = new CheckingAccount(100.00, "123");
			assertEquals(100.00,a1.getBalance(),2);
			
			a1.deposit(52.34);
			a1.deposit(5.22);
			assertEquals(157.56,a1.getBalance(),2);
		}
		catch (Exception e)
		{
			fail();
		}				
	}

	
	@Test
	public void testCheckingWithraw()
	{
		CheckingAccount a1;
		try
		{
			a1 = new CheckingAccount(100.00, "123");
			assertEquals(100.00,a1.getBalance(),2);
			
			a1.withdraw(10.00);
			a1.withdraw(1.98);
			assertEquals(88.02,a1.getBalance(),2);
		}
		catch (Exception e)
		{
			fail();
		}				
	}
	
	@Test
	public void testCheckingWithrawISF() throws Exception
	{
	
		
		CheckingAccount a1;
        a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
			
		a1.withdraw(100.00);
		assertEquals(0.00,a1.getBalance(),2);
		
		// balance should still be 0 after this withdrawal
		a1.withdraw(1.98);
		assertEquals(0.00,a1.getBalance(),2);
	}
	
	@Test
	public void testCheckingWithrawFee() throws Exception
	{
		
		CheckingAccount a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
			
		a1.withdraw(10.00);
		assertEquals(90.00,a1.getBalance(),2);
		
		a1.withdraw(10.00);
		assertEquals(80.00,a1.getBalance(),2);
		
		a1.withdraw(10.00);
		assertEquals(70.00,a1.getBalance(),2);
		
		// should have $3 fee.  70 - 10 - fee($3) = 67
		a1.withdraw(10.00);
		assertEquals(57.00,a1.getBalance(),2);		
	}
	
	
	@Test
	public void testCheckingDeposits() throws Exception
	{		
		CheckingAccount a1;
		a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
			
		a1.deposit(100.00);
		a1.deposit(1.01);
		assertEquals(201.01,a1.getBalance(),2);
	}
	
	@Test
	public void testCheckingDepositWithdraw() throws Exception
	{		
		CheckingAccount a1;
		a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
			
		a1.deposit(100.00);
		a1.deposit(1.01);
		assertEquals(201.01,a1.getBalance(),2);
		
		a1.withdraw(100);
		assertEquals(101.01,a1.getBalance(),2);
	}
	
	@Test
	public void testCheckingInterest() throws Exception
	{		
		CheckingAccount a1;
		a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
					
		// add 2% interest
		a1.addInterest();
		assertEquals(102.00,a1.getBalance(),2);		
	}
	
	//-----------------------------------------------
	
	@Test
	public void testSavingsCreation()
	{
		CheckingAccount a1 = new CheckingAccount(500.00, "123");
		// default balance = 0.00
		CheckingAccount a2 = new CheckingAccount("999");
			
		assertEquals(500.00,a1.getBalance(),2);
		assertEquals(00,a2.getBalance(),2);
	
	}
	
	@Test
	public void testSavingsDeposit()
	{
		CheckingAccount a1;
		try
		{
			a1 = new CheckingAccount(100.00, "123");
			assertEquals(100.00,a1.getBalance(),2);
			
			a1.deposit(52.34);
			a1.deposit(5.22);
			assertEquals(157.56,a1.getBalance(),2);
		}
		catch (Exception e)
		{
			fail();
		}				
	}


	
	@Test
	public void testSavingsWithraw()
	{
		CheckingAccount a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
			
		a1.withdraw(10.00);
		a1.withdraw(1.98);
		assertEquals(88.02,a1.getBalance(),2);
			
	}
	
	@Test
	public void testSavingsWithrawISF() throws Exception
	{
			
		CheckingAccount a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
			
		a1.withdraw(100.00);
		assertEquals(0.00,a1.getBalance(),2);
		
		// can't go negative when no money
		a1.withdraw(1.98);
		assertEquals(0.00,a1.getBalance(),2);

	}
	
	
	
	@Test
	public void testSavingsDeposits() throws Exception
	{		
		CheckingAccount a1;
		a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
			
		a1.deposit(100.00);
		a1.deposit(1.01);
		assertEquals(201.01,a1.getBalance(),2);
	}
	
	@Test
	public void testSavingsDepositWithdraw() throws Exception
	{		
		CheckingAccount a1;
		a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
			
		a1.deposit(100.00);
		a1.deposit(1.01);
		assertEquals(201.01,a1.getBalance(),2);
		
		a1.withdraw(100);
		assertEquals(101.01,a1.getBalance(),2);
	}
	
	@Test
	public void testSavingsInterest() throws Exception
	{		
		CheckingAccount a1;
		a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
					
		// add 2% interest
		a1.addInterest();
		assertEquals(102.00,a1.getBalance(),2);		
	}
	
	@Test
	public void testSavingsInterestLowBalance() throws Exception
	{		
		CheckingAccount a1;
		a1 = new CheckingAccount(100.00, "123");
		assertEquals(100.00,a1.getBalance(),2);
		
		a1.withdraw(10.00);
		assertEquals(90.00,a1.getBalance(),2);	
					
		// no interest added
		a1.addInterest();
		assertEquals(90.00,a1.getBalance(),2);		
	}
}
