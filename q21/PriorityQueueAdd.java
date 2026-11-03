import java.util.PriorityQueue;

public class PriorityQueueAdd {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50); pq.add(30); pq.add(40); pq.add(10); pq.add(20);
        // Printing shows the internal heap order, not fully sorted order
        System.out.println("Queue: " + pq);
    }
}
