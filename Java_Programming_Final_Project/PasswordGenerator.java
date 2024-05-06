package Java_Programming_Final_Project;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passwordLength = 0;
        boolean validInput = false;

        // Keep asking for input until a valid integer is entered
        while (!validInput) {
            try {
                System.out.print("Enter the desired password length: ");
                passwordLength = scanner.nextInt(); // Read the user's input
                validInput = true; // If we got here, the input was a valid integer
            } catch (InputMismatchException e) {
                // If the input was not a valid integer, inform the user and discard the invalid input
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        // Generate a password of the specified length
        String password = generatePassword(passwordLength);

        // Print the generated password
        System.out.println("Generated Password: " + password);
    }

    private static String generatePassword(int length) {
        // Define the set of characters that can be used in the password
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Use a StringBuilder to build the password
        StringBuilder password = new StringBuilder();

        // For each character in the password
        for (int i = 0; i < length; i++) {
            // Generate a random index into the character set
            int randomIndex = random.nextInt(characterSet.length());

            // Append the character at the random index to the password
            password.append(characterSet.charAt(randomIndex));
        }

        // Convert the StringBuilder to a string and return it
        return password.toString();
    }
}