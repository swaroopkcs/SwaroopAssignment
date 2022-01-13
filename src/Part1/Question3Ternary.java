package Part1;

import java.util.Scanner;

public class Question3Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check for Prime Number:");
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number you want to check:");
		int num = sc.nextInt();
		boolean isPrime=true;
		if (num==0||num==1) {
			System.out.println(num+" is not a Prime Number");
		} else {
			for (int counter =2; counter<num; counter++)
			{
				if (num%counter==0) {
					isPrime = true;
					break;
				} else {
					isPrime = false;
				}
			}
		}
		if(isPrime) {
			System.out.println(num+" is not a Prime Number");
		} else {
			System.out.println(num+" is a Prime Number");
		}
	}

}
