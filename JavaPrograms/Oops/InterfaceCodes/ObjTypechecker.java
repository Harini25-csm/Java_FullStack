package Oops.InterfaceCodes;

public class ObjTypechecker {
    public static String m1(Object obj){
        return obj.getClass().getName();
    }
    public static void main(String[] args) {
       
        Integer num=12;
        System.out.println(m1(num));//java.lang.Integer
        Double d=24.0;
        System.out.println(num.byteValue());//12
        System.out.println(d.shortValue());//24
        System.out.println(num.longValue());//12
        System.out.println(d.doubleValue());//24.0
        System.out.println(num.floatValue());//12.0
        System.out.println(d.getClass().getSimpleName());//Double
        String s="Harini";
        Character c='d';
        System.out.println(c.getClass());//class java.lang.Character
        System.out.println(m1(s));//java.lang.String
    }
   
}
