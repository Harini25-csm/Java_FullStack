package Strings_StrBuilder_strBuffer;

public class sb_methods {
    public static void main(String[] args) {
        //method 1 (empty sb with default capacity 16 characters)
        StringBuilder sb1=new StringBuilder();
        sb1.append("Hello");
        System.out.println("sb1:"+sb1);

        //method 2(Dynamically you can give the capacity length)
        StringBuilder sb2=new StringBuilder(50);
        for(int i=0;i<20;i++){
            sb2.append(i);
        }
        System.out.println("sb2:"+sb2);

        //method 3
        StringBuilder sb3=new StringBuilder("Java"+" ");
        sb3.append("program");
        System.out.println("sb3:"+sb3);

        //method 4
        String s="Hello";
        StringBuilder sb4=new StringBuilder(s);
        sb4.append(" world!");
        System.out.println("sb4:"+sb4);

    }
}
