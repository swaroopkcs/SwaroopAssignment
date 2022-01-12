package TernaryOperators;

import java.util.Scanner;

public class DivisibleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Dividend: ");
		int dividend = sc.nextInt();
		System.out.println("Enter the Divisor: ");
		int divisor = sc.nextInt();
		String divisible = "is divisible by";
		String notDivisible = "is not divisible by";
		String checkDivisibility = (dividend%divisor==0)? divisible: notDivisible;
		System.out.println(dividend+" "+checkDivisibility+" "+divisor);
	}

}
