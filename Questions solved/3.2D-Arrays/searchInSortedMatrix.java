public class searchInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 40;
        if (search(matrix, key) == false) {
            System.out.println("Not found");
        }
    }

    public static boolean search(int matrix[][], int key) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (key == matrix[i][j]) {
                System.out.println(i + " index " + j);
                return true;
            } else if (key > matrix[i][j]) {
                i++;

            } else {
                j--;
            }
        }
        return false;
    }
}
