package Task;

import java.util.Scanner;

public class NumberToDay {
    public static String getDayName(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid Day Number";
                break;
        }
        return dayName;
    }

    public static void main(String[] args) {

// Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        int number;

        // Declare an array to store the seven inputs
        String[] inputs = new String[7];

        System.out.println("Please enter seven inputs:");

        // Loop to get seven inputs from the user
        for (int i = 0; i < 7; i++) {
            System.out.print("Input " + (i + 1) + ": ");
            inputs[i] = scanner.nextLine(); // Read the entire line of input
        }

        System.out.println("\nYou entered the following inputs:");

        // Loop to display the entered inputs
        for (int i = 0; i < 7; i++) {
            System.out.println("Input " + (i + 1) + ": " + inputs[i]);
        }

        // Close the scanner to release system resources
        scanner.close();



        int day1 = 1;
        int day2 = 2;
        int day3 = 3;
        int day4 = 4;
        int day5 = 5; 
        int day6 = 6; 
        int day7 = 0; 



        System.out.println(day1 + " " + getDayName(day1));
        System.out.println(day2 + " " + getDayName(day2));
        System.out.println(day3 + " " + getDayName(day3));
        System.out.println(day4 + " " + getDayName(day4));
        System.out.println(day5 + " " + getDayName(day5));
        System.out.println(day6 + " " + getDayName(day6));
        System.out.println(day7 + " " + getDayName(day7));

    }
}
