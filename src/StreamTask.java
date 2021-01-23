import java.util.Arrays;

public class StreamTask {
    /**
     * Function to accept int array,
     * filter only even numbers,
     * and return sum of its square values.
     */

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .reduce(0, (acc, elem) -> acc + elem * elem);
    }

    /**
     * Function to accept int array,
     * filter only odd numbers,
     * and return as int array sorted in ascending order.
     */
    public static int[] getSortedOddsArray(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();
    }
}
