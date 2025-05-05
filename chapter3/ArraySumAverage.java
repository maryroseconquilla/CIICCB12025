package chapter3;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[] numbers = {91, 82, 93, 84, 75};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
