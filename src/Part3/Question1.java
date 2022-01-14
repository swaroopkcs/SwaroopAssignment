package Part3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int evenCount=0;
		int oddCount=0;
		Scanner sc = new Scanner (System.in);
		for (int counter=1; counter<=10; counter++) {
			System.out.print("Please enter the "+counter+" number:   ");
			number = sc.nextInt();
			if (number%2==0) {
				evenCount=evenCount+1;
			} else {
				oddCount = oddCount+1;
			}
		}
		
		System.out.println("There are "+evenCount+" even numbers in the list entered");
		System.out.println("There are "+oddCount+" odd numbers in the entered list.");

	}

}
