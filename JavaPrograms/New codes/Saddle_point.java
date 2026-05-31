package Arrays_Methods;

public class Saddle_point {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {7,5,6},
            {1,8,9}
        };
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            // find min element in the current row
            int minVal = matrix[i][0];
            int minCol = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minCol = j;
                }
            }
            // check if minVal is the maximum in its column
            boolean isSaddlePoint=true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minCol] > minVal) {
                    isSaddlePoint=false;
                    break;
                }
            }
            if (isSaddlePoint) {
                System.out.println("Saddle point in the matrix = " + minVal);
                found=true;
            }
        }
        if (!found) {
            System.out.println("No saddle point in the matrix");
        }
    }
}
