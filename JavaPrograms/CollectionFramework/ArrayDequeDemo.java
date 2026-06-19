package CollectionFramework;

import java.util.ArrayDeque;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.addFirst("Java");
        ad.addLast("Python");
        ad.offerFirst("C");
        ad.offerLast("JavaScript");
        System.out.println("ArrayDeque: " + ad);
        System.out.println("First Element: " + ad.peekFirst());
        System.out.println("Last Element: " + ad.peekLast());
        System.out.println("Removed First: " + ad.pollFirst());
        System.out.println("Removed Last: " + ad.pollLast());
        System.out.println("After Removal: " + ad);
        System.out.println("Size: " + ad.size());
    }
}
