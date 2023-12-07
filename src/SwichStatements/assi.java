package SwichStatements;

import java.util.Scanner;

public class assi {
    public static void main(String[] args) {

        boolean isSunny;

        // Ask the user "Is it sunny outside?"
        System.out.println("Is it sunny outside?");

        // Take user input
        Scanner scanner = new Scanner(System.in);
        // Convert user input to lowercase for case-insensitivity
        isSunny = scanner.nextLine().toLowerCase().equals("yes");

        // Check if it is sunny
        if (isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");

            // Ask the user "What is the temperature outside?"
            System.out.println("What is the temperature outside?");

            // Declare int temperature
            int temperature = scanner.nextInt();

            // Check temperature conditions
            if (temperature > 85) {
                System.out.println("I am going to the beach!");
            } else {
                System.out.println("I am going to the park!");
            }
        } else {
            System.out.println("I stay home and practice Java!");
        }

        // Close the scanner
        scanner.close();
    }
}
