package Task;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter String:  ");
        String msg = input.nextLine();

       // initializing a string
      System.out.println("The given String is: " + msg);
      // initial count of the words
      int total = 1;
      // loop variable
      int i = 0; 
      // while loop to count the number of words
      while (i < msg.length()) { 
         // checking if the current character is space or not
            if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' '))  {
            total++;  // incrementing the word count
            }
            i++; // incrementing loop variable
        } 
            // printing the result
            System.out.println("Number of words in the given string: " +  total);
    } 
}