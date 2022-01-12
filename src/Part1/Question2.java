package Part1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int waterTank = 1000;
		int bucket = 100;
		System.out.println("Please enter the quantity of water present in the tank.");
		Scanner sc = new Scanner (System.in);
		int presentQuantity = sc.nextInt();
		int toBeFilled = waterTank-presentQuantity;
		for (int count=1; count*bucket<=toBeFilled; count++) {
			System.out.println((count*bucket+presentQuantity)+" Litres filled "+(toBeFilled-count*bucket)+" L to go");
			if (toBeFilled<bucket) {
				System.out.println("The Tank is almost full. Please fill "+toBeFilled+" L only");
			}
		}
		System.out.println("The Tank is filled. Please stop to avoid overflowing of the tank.");

	}

}
