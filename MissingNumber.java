package collection;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int finalNUm = 10 * (10 + 1) / 2;

        System.out.println(finalNUm - sum);


        Integer[] input = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.asList(input).contains(5));

    }
}
