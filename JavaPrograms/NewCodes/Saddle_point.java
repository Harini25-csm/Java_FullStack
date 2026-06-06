package NewCodes;

public class Saddle_point {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            // find min element in the current row
            int minVal = matrix[i][0];
            int minCol = 0;
            for (int j = i+1; j < matrix.length; j++) {
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
