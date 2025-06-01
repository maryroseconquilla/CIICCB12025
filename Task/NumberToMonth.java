package Task;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class NumberToMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the number of month: "); // Prompt the user for input
        int monthNumber = input.nextInt(); // Read the integer grade from the user

        //int monthNumber = 7; // Represents July

        // Get the Month enum instance for the given number
        Month month = Month.of(monthNumber);

        // Get the full display name of the month in English
        String monthName = month.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.println("Month number " + monthNumber + " is " + monthName);
    }
}
