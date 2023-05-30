import java.util.Arrays;

class MatrixUtil {
    // change all elements of row x and column y to -1
    public static void changeRowColumn(int[][] mat, int M, int N,
                                       int x, int y) {
        for (int j = 0; j < N; j++) {
            if (mat[x][j] != 0) {
                mat[x][j] = -1;
            }
        }

        for (int i = 0; i < M; i++) {
            if (mat[i][y] != 0) {
                mat[i][y] = -1;
            }
        }
    }

    // Function to convert the matrix
    public static void convert(int[][] mat) {
        // M x N matrix
        int M = mat.length;
        int N = mat[0].length;

        // traverse the matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 0) { // cell (i, j) has value 0
                    // change each non-zero element in row i and
                    // column j to -1
                    changeRowColumn(mat, M, N, i, j);
                }
            }
        }

        // traverse the matrix once again and replace cells having
        // value -1 with 0
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1},
                        {0, 1, 1, 1, 1}
                };

        // convert the matrix
        convert(mat);

        // print matrix
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
