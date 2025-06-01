package Task;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the numerical grade: "); // Prompt the user for input
        int grade = input.nextInt(); // Read the integer grade from the user

        char letterGrade; // Declare a variable to store the letter grade

        // Determine the letter grade based on the numerical grade
        if (grade >= 90 && grade <= 100) {
            letterGrade = 'A' ;
        } else if (grade >= 80 && grade < 89) {
            letterGrade = 'B';
        } else if (grade >= 70 && grade < 79) {
            letterGrade = 'C';
        } else if (grade >= 60 && grade < 69) {
            letterGrade = 'D';
        } else if (grade >= 0 && grade < 60) {
            letterGrade = 'F';
        } else {
            // Handle invalid input (grades outside 0-100)
            System.out.println("Invalid grade entered. Please enter a grade between 0 and 100.");
            input.close(); // Close the scanner
            return; // Exit the program
        }

        System.out.println("The letter grade is: " + letterGrade); // Print the letter grade

        input.close(); // Close the scanner to release resources
    }
}
