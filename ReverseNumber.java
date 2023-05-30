package collection;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        reverse(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    static void reverse(int[] input) {

        for (int i = 0; i < input.length / 2; i++) {
            var tmp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = tmp;
        }

        // System.out.println(Arrays.toString(input));
    }
}
