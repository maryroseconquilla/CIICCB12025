package Task7;

public class BasicArithmetic {
    // Method with an integer return type
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        int sum = a-b;
        return sum;
    }

    public static int multiply(int a, int b) {
        int sum = a*b;
        return sum;
    }

    public static int divide(int a, int b) {
        int sum = a/b;
        return sum;
    }

    // Method with a String return type
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }


    public static void main(String[] args) {
        int resultSum = add(5, 3);
        int resultMinus = minus(5, 3);
        int resultMultiply = multiply(5, 3);
        int resultDivide = divide(5, 3);
        System.out.println("The sum is: " + resultSum); // Output: The sum is: 8
        System.out.println("The sum is: " + resultMinus); // Output: The sum is: 2
        System.out.println("The sum is: " + resultMultiply); // Output: The sum is: 15
        System.out.println("The sum is: " + resultDivide); // Output: The sum is: 1

        String greetingMessage = greet("Task7");
        System.out.println(greetingMessage); // Output: Hello, Task7!
    }
}
