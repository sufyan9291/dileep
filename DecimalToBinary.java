import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter ddecimal number to convert into binary:");

        Scanner sc = new Scanner(System.in);

        String result = dedcimalToHexa(sc.nextInt());

        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }

    }

    static String dedcimalToBinary(int input) {
        String binary = "";
        while (input > 0) {
            binary = binary + input % 2;
            input = input / 2;
        }
        return binary;
    }

    static String dedcimalToHexa(int input) {
        String hexa = "";
        // Digits in hexadecimal number system
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (input > 0) {
            hexa = hexa + hex[input % 16];
            input = input / 16;
        }
        return hexa;
    }

}
