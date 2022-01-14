package Part3;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial=1;
		System.out.print("Please enter the number for which the factorial is to be found:   ");
		Scanner sc = new Scanner (System.in);
		int enteredNumber = sc.nextInt();
		for (int counter = enteredNumber; counter>0; counter--) {
			factorial = factorial*counter;
		}
		System.out.println("The factorial of "+enteredNumber+" is "+factorial);

	}

}
