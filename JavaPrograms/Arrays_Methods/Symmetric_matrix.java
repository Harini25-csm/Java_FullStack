//Symmetrix matrix is a square matrix =
package Arrays_Methods;

public class Symmetric_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {2,6,7},
            {3,7,9}
        };
        boolean sm = true;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] != matrix[j][i]){
                    sm = false;
                    break;
                }
            }
            if(!sm){//breaks the outer loop as well
                break;
            }
        }
        if(sm)
            System.out.println("Symmetric matrix");
        else
            System.out.println("Not a Symmetric matrix");
    }
}