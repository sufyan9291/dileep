import java.util.Scanner;

public class DoubleDemo {
    public static void main(String args[]) {

        System.out.println("Enter String to get double");
        Scanner sc = new Scanner(System.in);
        System.out.println("Double Value :" + converIntoDouble(sc.nextLine()));

    }

    static double converIntoDouble(String input) {
        double number1 = 0.0;
        double number2 = 0.0;

        int index = input.indexOf('.');

        if (index > 0) {
            for (int i = 0; i < input.substring(0, index).length(); i++) {
                number1 = 10 * number1 + Character.getNumericValue(input.charAt(i));
            }

            for (int i = input.length() - 1; i > index; i--) {
                number2 = number2 / 10 + Character.getNumericValue(input.charAt(i));
            }
        } else {

            for (int i = 0; i < input.length(); i++) {
                number1 = 10 * number1 + Character.getNumericValue(input.charAt(i));
            }

        }

        return number1 + number2 / 10;
    }
}
