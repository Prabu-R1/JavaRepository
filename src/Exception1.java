import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int num1, num2,result;
	System.out.println("Enter two numbers");
	try {
	num1=sc.nextInt();
	num2=sc.nextInt();
	result=num1/num2;
	System.out.println("The result is "+ result);
	}
	catch(ArithmeticException ex) {
	   System.out.println(ex.getMessage());
	   System.out.println("Cannot divide by Zero");
	}
	
	catch(InputMismatchException ex) {
	   System.out.println("Enter correct values");
	}
	finally {
	    System.out.println("Bye!!!");
	}


	}
}
