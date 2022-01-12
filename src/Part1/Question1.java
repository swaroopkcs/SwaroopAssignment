package Part1;

import java.util.Scanner;

/*A thermostat is used in home cooling /heating system. 
Write a program to set temperature of the thermostat by taking input from user from console. 
i.e. if the user wants to set the temp to 21 degrees Celsius, he will enter this value in console, your program should read it from console and  print 
“Temp set to <value>” where value = temp entered by user in console*/
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the temperature that you want to set in degree Celsius");
		int setTemp = sc.nextInt();
		System.out.println("Thank you. The Temperature now set to "+setTemp+" degree celsius");

	}

}
