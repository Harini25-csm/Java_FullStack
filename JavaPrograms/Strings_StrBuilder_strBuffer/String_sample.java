package Strings_StrBuilder_strBuffer;

public class String_sample {
    public static void main(String[] args) {
        String a="hello";
        String b=a+"world!";
        String c=new String("hello");
        String d="hello";
        System.out.println(a==b);// false(different pool reference)
        System.out.println(b==c);//flase(different objs in heap => 1 is stored in literal 2nd is heap memory)
        System.out.println(a==d);//true(same pool reference)
        System.out.println(a.equals(c));//true(same conetent)
        System.out.println(a.equals(b));//flase
        System.out.println(c.equalsIgnoreCase("HELlo"));//true(it ignore the any 
        // type of case it may be upper, lower)
    }
}
