package Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        // //method 1
        int[] marks={85,234,59,50};
        // for(int i=0;i<marks.length;i++){
        //     System.out.println("The marks["+i+"]:"+marks[i]);
        // }
        for(int m:marks){//cleaner-enhanced for loop(for-each)
            System.out.println(m);
        }

        // //methos 2
        // int[] marks=new int[4];
        // marks[0]=53;
        // marks[1]=45;
        // marks[2]=54;
        // marks[3]=67;
        // for(int i=0;i<marks.length;i++){
        //     System.out.println("The marks["+i+"]:"+marks[i]);
        // }
    }
}
