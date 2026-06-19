package CollectionFramework;
import java.util.Stack;
public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(1);        
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.isEmpty());
        System.out.println(s.contains(4));
        System.out.println(s.size());
        System.out.println("search:"+s.search(2));
        System.out.println(s.get(0));
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println("Pop:"+s.pop());
        System.out.println(s);
    }
}
