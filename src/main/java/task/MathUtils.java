package task;

public class MathUtils {
    public static int addTwoDigits(int n) {
        if (n < 10 && n > 99) throw new IllegalArgumentException("n must be greater than 9 and less than 100");

        int sum = 0;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static int largestNumber(int n) {
        if (n < 1 && n > 9) throw new IllegalArgumentException("n must be greater 0 and less than 10");
        return (int) Math.pow(10, n) - 1;
    }
}
