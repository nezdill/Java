
package dillard1and2;
import java.util.Scanner;

public class ThisTrans {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Okay, you gave me a $50 bill."); // displaying to the user
		System.out.println("Enter the purchase price "); //telling the user enter price
		double purchasePrice = input.nextDouble(); //input should be a double for the purchase price
		
		int remainingAmount = (int)(50 - purchasePrice); // The formula for the transaction
		
		//Transactions for the different amount of bills 
		int numberOfTwenties = remainingAmount / 20;
		remainingAmount = remainingAmount % 20;
		
		int numberOfQuarters = remainingAmount / 10;
		remainingAmount = remainingAmount % 25;
		
		int numberOfDimes = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberOfNickles = remainingAmount / 1;
		remainingAmount = remainingAmount % 100; 
		
		double change = (50 - purchasePrice); // formula for the change var showing the amount left over
		
		System.out.println("Your change is " + change +" consists of" ); // displaying each bill amount
		System.out.println(" " + numberOfTwenties + " $20 bills" );
		System.out.println(" " + numberOfQuarters + " $10 bills");
		System.out.println(" " + numberOfDimes + " $5 bills");
		System.out.println(" " + numberOfNickles + " $1 bills");
	}

}
