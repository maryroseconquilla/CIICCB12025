package Task;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String originalString = (inputString); //"hello world";
        String reversedString = reverseString(originalString);
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);

        if (isPalindrome(inputString)) {
           System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();

    }

    public static boolean isPalindrome(String str) {
        String cleanString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static String reverseString(String input) {
        StringBuilderTenChar reversedString = new StringBuilderTenChar(input);
        reversedString.reverse();
        return reversedString.toString();
    }

    
}
