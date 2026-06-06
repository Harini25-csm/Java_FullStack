package Oops.InterfaceCodes;

public class WC {
    public static void main(String[] args) {
        int i=1;
        Integer i1=new Integer(2);
        long l=32984743;
        Long l1=new Long(128634726347346445l);
        Double d=55.43;
        double d1=new Double(67.48346);
        float f=1.0f;
        Float f1=new Float(24.3f);
        char c='_';
        Character c1=new Character('@');
        boolean b=true;
        Boolean b1=new Boolean(false);
        String s=new String("Harini");
        System.out.println(s);
        System.out.println(i);
        System.out.println(i1.getClass());//class followed by package(class java.lang.Integer)
        System.out.println(l);
        System.out.println(l1.getClass());
        System.out.println(d);
        System.out.println(d1);
        System.out.println(f);
        System.out.println(f1.getClass().getName());// package without class(java.lang.Float)
        System.out.println(c);
        System.out.println(c1.getClass().getSimpleName());//returns WC(Character)
        System.out.println(b);
        System.out.println(b1);

        
    }
}
