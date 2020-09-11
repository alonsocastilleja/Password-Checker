package hello;
import java.util.Scanner;

public class PasswordProgram {
	
	
	public static void main(String[] args) {
		// Scanner class is found in the java.util package 
		// System.util reads the keyboard input of the console program you are using. 
		// Create a Scanner object and assigning it to 'scanner'
		String password = "I like to eat pizza";
		
		// User prompt 
		System.out.println("Guess the password: ");
		
		// Creating a Scanner object that gets user input, storing it in the 'guess' variable 
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		// Using an if/else statement for both scenarios(correct and wrong password)
		if(password.equals(guess)) {
			System.out.println("You entered the correct password. You are logged in.");
			scanner.close();
			return;
		} else {
			System.out.println("You entered the wrong password. Please try again!!");			
		}
		
		// Closing the Scanner object in memory for the program.
		scanner.close();
	}
}


