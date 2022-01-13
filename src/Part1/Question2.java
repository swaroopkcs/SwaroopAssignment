package Part1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int waterTankCapacity = 100;
		int bucketCapacity = 10;
		System.out.println("Please enter the quantity of water present in the tank.");
		Scanner sc = new Scanner (System.in);
		int presentQuantity = sc.nextInt();
		int toBeFilled = waterTankCapacity-presentQuantity;
		for (int count=1; count*bucketCapacity<=toBeFilled; count++) {
			System.out.println((count*bucketCapacity+presentQuantity)+" Litres filled "+(toBeFilled-count*bucketCapacity)+" L to go");
			if ((toBeFilled-count*bucketCapacity)<bucketCapacity) {
				System.out.println("The Tank is almost full upto "+(count*bucketCapacity+presentQuantity)+" Please stop to avoid overflowing of the tank");
				}
		}
		

	}

}
