package Arrays_Methods;

public class Second_large {
    public static void main(String[] args) {
        int[] arr={12, 35, 2, 5, 34,1};
        int fl=-1;
        int sl=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fl){
                fl=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sl && arr[i]!=fl){
                sl=arr[i];
            }
        }
        System.out.println(sl);
    }
}
