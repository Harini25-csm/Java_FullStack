package Strings_StrBuilder_strBuffer;

public class Str_builder_op {
    public static void main(String[] args) {
        //using String Str_builder
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<20;i++){
            sb.append(i);
        }
        String sb_string=sb.toString();
        System.out.println("Append Using Str_builder:"+sb_string);//012345678910111213141516171819
        System.out.println(sb.getClass());

        //reverse of str using Str_builder
        String sb_rev=new StringBuilder("Hello").reverse().toString();
        System.out.println("Reverse using StringBuilder:"+sb_rev);//olleH

        //replace 
        String sb_replace=new StringBuilder("Hello").replace(1,2,"l").toString();
        System.out.println("Replace using StringBuilder:"+sb_replace);//Hlllo

        //delete
        String sb_delete=new StringBuilder("Hello").delete(1, 3).toString();
        System.out.println("Delete using StringBuilder:"+sb_delete);//Hlo

        //indexof 
        int sb_indexof = new StringBuilder("Hello").indexOf("e");
        System.out.println("Replace using StringBuilder:"+sb_indexof);//1
    }
}
