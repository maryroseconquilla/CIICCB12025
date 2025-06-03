package Task;

import java.util.Scanner;

public class StringBuilderTenChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(inputString);
        int length = stringBuilder.length();

        System.out.println("Length of the string: " + length);
        scanner.close();


        char firstChar = inputString.charAt(0);
        System.out.println("First character using charAt(): " + firstChar);

        String firstCharString = inputString.substring(0, 1);
        System.out.println("First character using substring(): " + firstCharString);                // Print the first character of the string.
    
        int index = inputString.indexOf('a');
        System.out.println("Index of first 'a': " + index);                                         // Print the index of the first occurrence of the letter 'a' in the string.
    
        String sub = inputString.substring(3, 7);                               // Note that the end index is exclusive                   // Print the substring of the string from index 3 to index 6.
        System.out.println(sub); // Output: loWo

        inputString = inputString + "123";
        System.out.println(inputString);                                                                    // Append the string "123" to the end of the string.                             


        String stringToInsert = "xyz";                                                                      // Insert the string "xyz" at index 4
        int indx = 4;
        String newString = new StringBuilder(inputString).insert(indx, stringToInsert).toString();

        System.out.println("Original String: " + inputString);
        System.out.println("New String: " + newString);


        int startIndex = 2;                             // Delete the substring from index 2 to index 4.
        int endIndex = 4;

        // Method 1: Using StringBuilder
        StringBuilder sb = new StringBuilder(inputString);
        sb.delete(startIndex, endIndex);
        String resultString1 = sb.toString();
        System.out.println("Result using StringBuilder: " + resultString1); 

        // Method 2: Using substring
        String resultString2 = inputString.substring(0, startIndex) + inputString.substring(endIndex);
        System.out.println("Result using substring: " + resultString2);

        int indexToDelete = 8;

        StringBuilder sb8 = new StringBuilder(inputString);              //Delete the character at index 8
        if (indexToDelete >= 0 && indexToDelete < sb.length()) {
            sb8.deleteCharAt(indexToDelete);
            String modifiedString = sb8.toString();
            System.out.println("Original String: " + inputString);
            System.out.println("Modified String: " + modifiedString);
        } else {
            System.out.println("Invalid index to delete.");
        }

        // Reverse the string and print it.
        String reversed = sb.reverse().toString();
        System.out.println("Reversed String: " + reversed);

    }
}