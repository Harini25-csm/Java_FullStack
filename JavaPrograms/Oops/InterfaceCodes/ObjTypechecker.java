package Oops.InterfaceCodes;

public class ObjTypechecker {
    public static String m1(Integer a){
        return a.getClass().getSimpleName();
    }
    public static void main(String[] args) {
       
        Integer num=12;
        System.out.println(m1(num));
        Double d=12.0;
        System.out.println(num.byteValue());
        System.out.println(num.shortValue());
        System.out.println(num.longValue());
        System.out.println(num.doubleValue());
        System.out.println(num.floatValue());
        
    }
   
}
