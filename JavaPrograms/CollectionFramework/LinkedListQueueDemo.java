package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
public class LinkedListQueueDemo {
     public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.offer("C");
        queue.offer("D");
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element());
        System.out.println("Poll: " + queue.poll());
        System.out.println("After Poll: " + queue);
        System.out.println("Remove: " + queue.remove());
        System.out.println("After Remove: " + queue);
        System.out.println("Size: " + queue.size());
    }
}
