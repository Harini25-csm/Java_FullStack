package Arrays_Methods;
import java.util.Arrays;
public class Maxele {
    public static void main(String[] args) {
        int[] marks={85,234,59,50};
        // int max=marks[0];//1st method
        // for(int i=1;i<marks.length;i++){
        //     // //max element in array (2nd method)
        //     // if(marks[i]>max){
        //     //     max=marks[i];
        //     //     System.out.println(max);
        //     // }
        //     max=Math.max(max,marks[i]);
            
        // }
        // System.out.println(max);
        
        // Arrays.sort(marks);//3rd method
        // System.out.println(marks[marks.length-1]);


        // // sum and avg 
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];  
        }
        System.out.println(sum);
        float avg=sum/marks.length;
        System.out.printf("%.2f",avg);


    }
}
