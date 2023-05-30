public class SpiralMatrix {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 10, 100},
                {4, 5, 6, 20, 200},
                {7, 8, 9, 30, 300},
                {11, 12, 13, 40, 400},
                {21, 22, 23, 24, 25}};

        int startColumn = 0;
        int startRow = 0;
        int columLen = 5;
        int rowLen = 5;

        while ((startColumn < columLen) && (startRow < rowLen)) {

            for (int i = startColumn; i < columLen; i++) {
                System.out.println(array[startRow][i]);
            }
            startRow++;

            for (int i = startRow; i < rowLen; i++) {
                System.out.println(array[i][columLen - 1]);
            }
            columLen--;

            for (int i = columLen - 1; i >= startColumn; i--) {
                System.out.println(array[rowLen - 1][i]);
            }
            rowLen--;

            for (int i = rowLen - 1; i >= startRow; i--) {
                System.out.println(array[i][startColumn]);
            }
            startColumn++;

        }
    }
}
