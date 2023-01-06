public class spiral {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printSpiral(matrix);
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j]);
                System.out.print(",");
                if (startRow == endRow) {
                    break;
                }
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]);
                System.out.print(",");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol + 1; j--) {
                System.out.print(matrix[endRow][j]);
                System.out.print(",");
                if (startCol == endCol) {
                    break;
                }
            }
            // left
            for (int i = endRow; i >= startCol + 1; i--) {
                System.out.print(matrix[i][startCol]);
                System.out.print(",");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }

    }

}
