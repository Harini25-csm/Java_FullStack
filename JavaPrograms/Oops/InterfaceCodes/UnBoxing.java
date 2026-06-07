package Oops.InterfaceCodes;

public class UnBoxing {
    public static void main(String[] args) {
        // //UnBoxing
        // Integer i=1;
        // Integer i1=new Integer(2);
        // int x=i;
        // int y=i1;
        // System.out.println(x+" "+y);
        // Character c='$';
        // Character c1=new Character('A');
        // int x1=c;
        // int y1=c1;
        // System.out.println(x1+" "+y1);
        // Float f=12.3f;
        // Float f1=new Float(23.5);
        // float x2=f;
        // float y2=f1;
        // System.out.println(x2+" "+y2);
      

        // // str to primitive
        // //str to int
        // int i=Integer.parseInt("123");
        // System.out.println("Integer:"+i);
        // //str to boolean
        // boolean bool=Boolean.parseBoolean("harini");
        // System.out.println("Boolean:"+bool);
        // //str to float
        // float f=Float.parseFloat("1.0f");
        // System.out.println("FLoat:"+f);
        // //str to long 
        // Long l=Long.parseLong("2305543423");
        // System.out.println("Long:"+l);
        // //str to double
        // Double d=Double.parseDouble("32.3432");
        // System.out.println("Double:"+d);
        // //str to short
        // Short s=Short.parseShort("50");
        // System.out.println("Short:"+s);
        // //str to byte
        // Byte by=Byte.parseByte("10");
        // System.out.println("Byte:"+by);
        // //str to char
        // String c="A";
        // char c1=c.charAt(0);
        // System.out.println("Character:"+c1);

        // Integer nullable=null;
        // System.out.println("Wrapper class can store null: "+nullable);

        // String s="null";
        // System.out.println(s);

        //Primitive values/Str into Wrapper obj
        //int to str
        String str=String.valueOf(123);//Primitive → String conversion. =>123 i/p to "123" o/p
        System.out.println("String:"+str);
        //Primitive/String → Wrapper Object.
        Integer obj = Integer.valueOf(123);
        System.out.println("Integer obj:"+obj); 

        int i1=Integer.valueOf(123)/*returns an Integer object.*/;// valueOf() returns an Integer object.
        //  Java automatically unboxes it into a primitive int.
        System.out.println(i1);
        /*
        int i1 = Integer.valueOf(123);
        ==
        Integer obj = Integer.valueOf(123); // Integer object
        int i1 = obj.intValue(); // Automatic unboxing
        */

        
        //Primitive/String → Wrapper Object.
        Boolean b = Boolean.valueOf("true");
        System.out.println("Boolean Object: " + b);
        // //str to int
        // String st=i.toString();
        // System.out.println(st);
    }
}
