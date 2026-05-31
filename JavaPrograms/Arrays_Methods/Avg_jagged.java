package Arrays_Methods;

public class Avg_jagged {
    public static void main(String[] args) {
        int[][] ja={
            {4,5,6},
            {7,8,4,3,87},
            {6,9}
        };
        for(int i=0;i<ja.length;i++){
            int sum = 0;
            for(int j=0;j<ja[i].length;j++){
                sum += ja[i][j];
            }
            float avg = (float) sum / ja[i].length;
            System.out.printf("Average of row " + (i+1) + " = " + "%.2f%n",avg);
        }
    }
}
