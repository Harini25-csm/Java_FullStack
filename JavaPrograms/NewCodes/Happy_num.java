//A happy num is a +ve integer that eventually reaches '1' 
// when you repeatedlly replace it with sum of square of the digits

package NewCodes;
import java.util.Scanner;
public class Happy_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num:");
        int n=sc.nextInt();
        while(n!=1 && n!=4 && n!=0){
            int sum=0;
            while(n>0){
                int r=n%10;
                sum+=r*r;
                n=n/10;
                
            }
            n=sum;
        }
        System.out.println(n==1?"Happy num":"Not a happy num");
    }
}
/*
ex: n=19
1*1+9*9=
*/