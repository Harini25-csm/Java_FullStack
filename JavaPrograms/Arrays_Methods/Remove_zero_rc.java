//leetcode (set zeros)

package Arrays_Methods;

public class Remove_zero_rc {
    public static void main(String[] args) {
        int[][] rz={
            {1,2,3},
            {0,5,8},
            {7,4,9}
        };
        int a=-1;
        int b=-1;
        for(int i=0;i<rz.length;i++){
            for(int j=0;j<rz[i].length;j++){
                if(rz[i][j]==0){
                    a=i;
                    b=j;
                    break;
                }

            }
        }
        for(int i=0;i<rz.length;i++){
            rz[a][i]=0;
        }
        for(int i=0;i<rz.length;i++){
            rz[i][b]=0;        
        }
        for(int i=0;i<rz.length;i++){
            for(int j=0;j<rz[i].length;j++){
                System.out.print(rz[i][j]+" ");                
            }
            System.out.println();
            
        }
    }
    
}

