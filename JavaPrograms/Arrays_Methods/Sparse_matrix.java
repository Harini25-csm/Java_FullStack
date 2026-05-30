// A sparse matrix is a matrix in which most of the elements are zero
//A matrix is genereally consider sparse is > non-zero elements
package Arrays_Methods;

public class Sparse_matrix {
    public static void main(String[] args) {
        int[][] sm={
            {1,2,3},
            {0,0,0},
            {0,3,0}
        };
        int cz=0;
        int cne=0;
        for(int i=0;i<sm.length;i++){
            for(int j=0;j<sm[i].length;j++){
                if(sm[i][j]!=0){
                    cne++;
                }
                else{
                    cz++;
                }
            }
        }
        System.out.println(cz>cne?"spare matrix":"Not spare matrix");
    }
}
/*

*/