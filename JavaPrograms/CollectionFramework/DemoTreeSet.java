package CollectionFramework;

import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>();
        for(int i=0;i<5;i++){
            t.add(i);
        }
        System.out.println(t);
    }
}
