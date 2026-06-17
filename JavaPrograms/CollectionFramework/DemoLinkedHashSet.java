package CollectionFramework;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        // Homogeneous
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);

        LinkedHashSet<Object> o = new LinkedHashSet<>();
        o.add(1);
        o.add("hi");
        o.add(3.3);
        o.add(4);
        System.out.println(o);
    }
        
}
