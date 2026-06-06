package Oops.InterfaceCodes;

public class UnBoxing {
    public static void main(String[] args) {
        //Integer i=1;
        // Integer i1=new Integer(2);
        // int x=i;
        // int y=i1;
        // System.out.println(x+" "+y);
        // Character c='$';
        // Character c1=new Character('A');
        // int x1=c;
        // int y1=c1;
        // System.out.println(x1+" "+y1);

        //str to primitive
        String s="123";
        int num=Integer.parseInt(s);
        System.out.println(num);
        //str to boolean
        String b="true";
        boolean bool=Boolean.parseBoolean(b);
        System.out.println(bool);
        //str to float
        String f="1.0f";
        float fl=Float.parseFloat(f);
        System.out.println(fl);
        //str to char
        String c="A";
        Character c1=Character.parseCharacter(c);
        System.out.println(fl);

        // Integer nullable=null;
        // System.out.println("Wrapper class can store null: "+nullable);

        // String s="null";
        // System.out.println(s);
        // //int to str
        // int i=123;
        // String str=String.valueOf(i);
        // System.out.println(str);
        // //str to int
        // String st=i.toString();
        // System.out.println(st);
    }
}
