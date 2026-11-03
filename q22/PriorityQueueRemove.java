import java.util.PriorityQueue;

public class PriorityQueueRemove {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50); pq.add(30); pq.add(40); pq.add(10); pq.add(20);
        System.out.println("Removing in priority order (smallest first):");
        while (!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
