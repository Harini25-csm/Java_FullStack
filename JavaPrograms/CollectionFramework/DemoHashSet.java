package CollectionFramework;
import java.util.HashSet;
public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Object> h=new HashSet<>();
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<5;i++){
            a.add(i);
        }
        System.out.println(a);
        h.add(10);
        h.add(20);
        h.add("hi");
        h.add("hi");
        h.add("hi");
        System.out.println(h.isEmpty());
        h.addAll(a);
        System.out.println(h);
        System.out.println(h.size());
    }
}
