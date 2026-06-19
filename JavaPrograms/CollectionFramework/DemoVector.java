//create heterogeneous of vector and check the capacity of vector when elements added into 19 elements
package CollectionFramework;

import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
        Vector<Object> v=new Vector<>(10,25);
        v.add(10);
        v.add("Harini");
        v.add('A');
        v.add(25.5);
        v.add(true);
        v.add(100);
        v.add("Java");
        v.add('B');
        v.add(45.6);
        v.add(false);
        v.add(200);
        v.add(10);
        v.add("Harini");
        v.add('A');
        v.add(25.5);
        v.add(true);
        v.add(100);
        v.add("Java");
        v.add('B');
        v.add(45.6);
        v.add(false);
        v.add(200);
        v.add(10);
        v.add("Harini");
        v.add('A');
        v.add(25.5);
        v.add(true);
        v.add(100);
        v.add("Java");
        v.add('B');
        v.add(45.6);
        v.add(false);
        v.add(200);
        v.add(10);
        v.add(10);
        v.add(10);
        
        
        System.out.println(v.size());
        System.out.println(v.capacity());
        
    }
}
