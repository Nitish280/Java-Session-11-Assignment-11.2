/**
 * An application that attempts to divide by zero
 * we are creating the airthmeticException.
 */
 
import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);//Scanner for input
		
		System.out.println("Input the numerator: ");
		int num1 = in.nextInt();
		
		int denominator = 0;
		
		System.out.println(num1/denominator);
		
		
		
		}

}
