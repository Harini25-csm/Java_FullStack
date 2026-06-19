package CollectionFramework;

import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(20);
        pq.offer(10);
        pq.offer(40);
        pq.add(30);
        System.out.println("Priority Queue: " + pq);
        System.out.println("Peek Element: " + pq.peek());
        System.out.println("Poll Element: " + pq.poll());
        System.out.println("After Poll: " + pq);
        System.out.println("Contains 30? " + pq.contains(30));
        System.out.println("Size: " + pq.size());
        pq.remove();
        System.out.println("After Remove: " + pq);
    }
}

