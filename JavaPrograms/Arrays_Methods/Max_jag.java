package Arrays_Methods;

public class Max_jag {
    public static void main(String[] args) {
        int[][] ja={
            {4,5,6},
            {7,8,4,3,87},
            {6,9}
        };
        int max=ja[0][0];
        for(int i=1;i<ja.length;i++){
            for(int j=1;j<ja[i].length;j++){
                if(ja[i][j]>max){
                    max=ja[i][j];
                }
                
            }
            System.out.println();
        }
        System.out.println("Max ele:"+max);
    }
}
