package CollectionFramework;
import java.util.LinkedList;
public class DemoLL{
    public static void main(String[] args) {
        //homogeneous
        LinkedList<Integer> l=new LinkedList<>();
        l.addFirst(1);
        l.add(2);
        l.add(3);
        l.addLast(4);
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        System.out.println();

        //heterogeneous
        LinkedList<Object> h=new LinkedList<>();
        h.addFirst(1);
        h.add(2);
        h.add(3.2);
        h.addLast("hi");
        System.out.println(h);
        System.out.println(h.getFirst());
        System.out.println(h.getLast());
        System.out.println(h.removeFirst());
        System.out.println(h.removeLast());
    }
}