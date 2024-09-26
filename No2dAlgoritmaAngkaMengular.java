public class No2dAlgoritmaAngkaMengular {
    public static void main(String[] args) {
        int n = 5; // Ukuran matriks
        int[][] matrix = new int[n][n];

        int num = 1;


        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = num++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
