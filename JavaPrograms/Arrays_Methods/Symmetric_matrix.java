//Symmetrix matrix is a square matrix =
package Arrays_Methods;

public class Symmetric_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {2,6,7},
            {3,8,9}
        };
        boolean sm = true;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] != matrix[j][i]){
                    sm = false;
                    break;
                }
            }
            if(!sm){
                break;
            }
        }
        if(sm)
            System.out.println("Symmetric matrix");
        else
            System.out.println("Not a Symmetric matrix");
    }
}