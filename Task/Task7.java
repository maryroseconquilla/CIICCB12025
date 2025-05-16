package Task;

public class Task7 {
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


    public static void main(String[] args) {
        int resultSum = add(5, 3);
        int resultMinus = minus(5, 3);
        int resultMultiply = multiply(5, 3);
        int resultDivide = divide(5, 3);
        System.out.println("Addition: " + resultSum); // Output: The sum is: 8
        System.out.println("Substraction: " + resultMinus); // Output: The sum is: 2
        System.out.println("Multiplication: " + resultMultiply); // Output: The sum is: 15
        System.out.println("Division: " + resultDivide); // Output: The sum is: 1
    }
}
