package Task8;

public class TestParam {
    
    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static void main(String[] args) {
        int sum1 = sum(1, 2, 3, 4);
        int sum2 = sum(1, 2, 3, 4, 5);
        int sum3 = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int total = sum(sum1,sum2,sum3);

        System.out.println("Sum of 1, 2, 3, 4: " + sum1);
        System.out.println("Sum of 1, 2, 3, 4, 5: " + sum2);
        System.out.println("Sum of 1, 2, 3, 4, 5, 6, 7, 8, 9, 10: " + sum3);
        System.out.println("Total: " + total);
    }
}
