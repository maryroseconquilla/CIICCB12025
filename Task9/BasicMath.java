package Task9;

public class BasicMath {
   public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int subtract(int a, int b) {
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
        int resultMinus = subtract(5, 3);
        int resultMultiply = multiply(5, 3);
        int resultDivide = divide(5, 3);
        System.out.println("The sum is: " + resultSum); // Output: The sum is: 8
        System.out.println("The sum is: " + resultMinus); // Output: The sum is: 2
        System.out.println("The sum is: " + resultMultiply); // Output: The sum is: 15
        System.out.println("The sum is: " + resultDivide); // Output: The sum is: 1
    }
}
