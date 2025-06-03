package Task;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("The length of the string is: " + length);
        String uppercaseString = str.toUpperCase();
        System.out.println(uppercaseString);
        String lowercaseString = str.toLowerCase();
        System.out.println(lowercaseString);
        char firstChar = str.charAt(0);
        System.out.println("The first character is: " + firstChar);

        if (str.length() > 0) {
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("Last character: " + lastChar);
        } else {
            System.out.println("String is empty.");
        }

        String sub = str.substring(1, 5);
        System.out.println(sub);
    }
}
