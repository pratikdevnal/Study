public class diagonalSum {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(sum(matrix));
    }

   
    public static int sum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }
}
