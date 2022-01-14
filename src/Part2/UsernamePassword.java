package Part2;

import java.util.Scanner;

public class UsernamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "pivotAdmin";
		String password = "Admin123";
		Scanner sc = new Scanner(System.in);
		boolean isCredentialsCorrect = false;
		int attempt = 0;
		for (int counter = 3; counter >0; counter--) {
			System.out.println("Please enter your Username: ");
			String enteredUsername = sc.next();
			System.out.println("Please enter your password");
			String enteredPassword = sc.next();
			if (enteredUsername.equals(userName) && enteredPassword.equals(password)) {
				System.out.println("You are logged into the Application");
				break;
			} else {
				attempt+=1;
				if(attempt==3)
				{
					System.out.println("Account Locked.");
					break;
				}
				System.out.println("Incorrect UserID or Password. Please try again");
			}


		}
	}

}
