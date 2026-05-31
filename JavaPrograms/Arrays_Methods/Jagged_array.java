/*
JA is a 2D array where each row can have diff nu.of col(diff no.of ele)
umlike a regualr matrix rows are not required to be same length 
Ex: int[][] jagged={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
Dynamic jagged array:
=> 
*/

package Arrays_Methods;

import java.util.Scanner;
public class Jagged_array {
    public static void main(String[] args) {
        // int[][] j=new int[3][0];
        // j[0]=new int[3];
        // j[1]=new int[2];
        // j[2]=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows:");
        int n=sc.nextInt();
        int[][] ja=new int [n][];
        for(int i=0;i<n;i++){
            System.out.print("Enter no.of cols"+(i+1)+":");
            int col=sc.nextInt();
            ja[i]=new int[col];
            System.out.print("Enter "+col+" elements:");
            for(int j=0;j<col;j++){
                ja[i][j]=sc.nextInt();
            }
        }
        // int[][] ja={
        //     {4,5,6},
        //     {7,8,4,3,87},
        //     {6,9}
        // };
        for(int i=0;i<ja.length;i++){
            for(int j=0;j<ja[i].length;j++){
                System.out.print(ja[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}

/*

*/
//wajp to find largest elemet in jagged array
// write a java program find the avg of each row in 