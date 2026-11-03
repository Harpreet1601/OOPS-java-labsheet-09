import java.util.PriorityQueue;

public class PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30); pq.add(5); pq.add(20);
        System.out.println("peek(): " + pq.peek());      // smallest element, not removed
        System.out.println("Size after peek: " + pq.size());
    }
}
