import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String args[]) {

        int[][] input = new int[3][3];
        System.out.println("Enter input matrix");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        transposeMatrix(input);
    }

    static void transposeMatrix(int[][] input) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[j][i] = input[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }

}
