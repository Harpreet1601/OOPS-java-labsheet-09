import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();   // Queue reference -> LinkedList object
        q.add("A"); q.add("B"); q.add("C");
        System.out.println("Queue: " + q);
        System.out.println("Removed: " + q.remove());   // removes head (FIFO)
        System.out.println("Queue: " + q);
    }
}
