package MultiThreading_Exceptions;

public class HandlingExce {
    public static void main(String[] args) {
        try{
            int[] a={3,5,4};
            try{
                System.out.println(10/0);  
            }catch(Exception e){
                System.out.println("Inner catch block");
                e.printStackTrace();
                System.out.println();
            }
            System.out.println(a[15]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("outer catch block");
            e.printStackTrace();
        }

        // int arr[]={3,25,5,-1,4,55};
        // try{
        //     System.out.println(arr[45]);
        // }catch(Exception e){
        //     System.out.println(e.getMessage());//only senario, non-static
        //     e.printStackTrace();//all the details of exception and non static
        // }finally{
        //     System.out.println("finally block");
        // }
        // System.out.println("end");
    }
}
