package CollectionFramework;

import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> m=new TreeMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",3);
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.get("b"));
        System.out.println(m.put("c",4));
        System.out.println(m.containsKey("c"));
    }
}
