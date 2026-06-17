package CollectionFramework;

import java.util.LinkedHashMap;

public class DemoLinkedHM {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> m=new LinkedHashMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",3);
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.get("b"));
        System.out.println(m.put("c",4));
        System.out.println(m.containsKey("c"));
        System.out.println();

        LinkedHashMap<Object,Object> i=new LinkedHashMap<>();
        i.put("a",1);
        i.put(2,2.2);
        i.put(1.2,"hi");
        i.put("s","harini");
        i.put("f","ramanaiah");
        System.out.println(i);
        System.out.println(i.keySet());
        System.out.println(i.get(1.2));
        System.out.println(i.put(2,4.2));
        System.out.println(i.containsKey("a"));
    }
}
