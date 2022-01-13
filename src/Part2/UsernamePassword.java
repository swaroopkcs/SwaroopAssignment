package Part2;

import java.util.Scanner;

public class UsernamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "pivotAdmin";
		String password = "Admin123";
		Scanner sc = new Scanner(System.in);
		boolean isCredentialsCorrect = false;
		for (int counter = 1; counter <= 3; counter++) {
			System.out.println("Please enter your Username: ");
			String enteredUsername = sc.next();
			System.out.println("Please enter your password");
			String enteredPassword = sc.next();
			if (enteredUsername.equals(userName) && enteredPassword.equals(password)) {
				System.out.println("You are logged into the Application");
				break;
			} else {
				System.out.println("Incorrect UserID or Password. Please try again");
			}
			System.out.println("Account Locked");

		}
	}

}
