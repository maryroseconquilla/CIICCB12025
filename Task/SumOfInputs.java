package Task;

import java.util.Scanner;

public class SumOfInputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;

        System.out.println("Enter integers to sum (enter 0 to finish):");

        // Loop until the user enters 0
        while ((input = scanner.nextInt()) != 0) {
            sum += input; // Add the input to the sum
        }

        System.out.println("The sum of all entered integers is: " + sum);
        scanner.close(); // Close the scanner to release resources
    }
}
