package Loops_patterns;
public class Patterns{
    public static void main(String[] args) {
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
                
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        for(int i=1;i<=4;i++){//outer loop
            for(int j=1;i<=4-i;j++){//inner loop to print space
                System.out.println(" ");
            }
            for(int j=1;j<=i;j++){//inner loop to print nums
                System.out.print(i+" ");
                
            }
            System.out.println();
        }
        System.out.println();



        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // for(int i=5;i>=0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // for(int i=5;i>=0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // int num=1;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum=i+j;
        //         if(sum%2==0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println();


        // for(int i=1;i<=4;i++){//outer loop 
        //     for(int j=1;j<=4-i;j++){//inner loop to print space 
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){//inner loop to print 2nd-half of pattern
        //         int sum=i+j;
        //         if(sum%2==0){
        //             System.out.print("1");
        //         }else{
        //             System.out.print("0");
        //         }
        //     }

        //     for(int j=i;j<(2*i-1);j++){//inner loop to print 2nd-half of pattern
        //         int sum=i+j;
        //         if(sum%2==1){
        //             System.out.print("1");
        //         }else{
        //             System.out.print("0");
        //         }
        //     }   
        //     System.out.println();
        //     }




    }
}
