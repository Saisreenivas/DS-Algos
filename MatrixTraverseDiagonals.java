import java.util.Arrays;

public class MatrixTraverseDiagonals {
    public void TraverseDiagonals(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            int tmp = matrix[i][i];
            matrix[i][i] = matrix[i][matrix.length-1-i];
            matrix[i][matrix.length-1-i] = tmp;
        }

        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        // System.out.println("Hello");
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // System.out.println(x);
                matrix[i][j] = i + j;
            }
        }
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
        MatrixTraverseDiagonals x = new MatrixTraverseDiagonals();
        x.TraverseDiagonals(matrix);
        
    }
}