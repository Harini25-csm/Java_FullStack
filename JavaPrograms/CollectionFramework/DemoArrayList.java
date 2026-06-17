package CollectionFramework;
//wa prg to implment arraylist class and insert the homogeneous ele of string type by using for loop
import java.util.ArrayList;
import java.util.Collection;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();
        ArrayList<Integer> m=new ArrayList<>();
        ArrayList<Double> n=new ArrayList<>();
        m.add(23);
        m.add(21);
        n.add(3.3);
        m.add(1);
        n.add(23.8);
        m.add(21);
        l.addAll(m);
        l.addAll(n);
        l.add(2.3);
        l.add("hi");
        System.out.println(l);
        System.out.println();

        //String
        ArrayList<String> s=new ArrayList<>();
        for(int i=0;i<=10;i++){
            s.add(String.valueOf(i));
        }
        System.out.println(s);
        s.add(1,"hi");
        System.out.println(s);
        System.out.println();

        ArrayList<Object> a=new ArrayList<>();
        for(int i=1;i<=10;i++){
            a.add(i);
        }
        a.add("hello");
        a.add(1.2f);
        System.out.println(a);
        System.out.println("Size:"+a.size());
        System.out.println("Check the list is empty:"+a.isEmpty());
        System.out.println(a.indexOf("hello"));
        System.out.println("updtae the element:"+a.set(2,"10"));
        System.out.println(a);
        a.add(12,"hi");
        System.out.println(a);
        System.out.println(a.get(0));
    }
}
