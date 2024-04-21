// We need to import the Scanner class from the java.util package
import java.util.Scanner;

// This is the start of our UserInput class
public class UserInput {
    // The main method is the entry point for any Java program
    public static void main(String[] args) {
        // We create a new Scanner object that reads from the standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // We print a message to the console asking the user to enter a paragraph
        System.out.println("Please enter a paragraph:");

        // We read the user's input until they press Enter
        String paragraph = scanner.nextLine();

        // We print the user's input to the console
        System.out.println("You entered: " + paragraph);
    }
}