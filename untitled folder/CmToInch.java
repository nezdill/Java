//Arnez Dillard 2339395

package dillard1and2;
import java.util.Scanner; //util imported package

public class CmToInch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter centimeters "); //displaying to user to Enter info
		double centimeters = input.nextDouble(); //input is a double
		
		//convert centimeters to inches
		double inches = centimeters * 0.39370079;
		System.out.println(centimeters +" cm" + " = "+ inches + " inches");
	}

}
