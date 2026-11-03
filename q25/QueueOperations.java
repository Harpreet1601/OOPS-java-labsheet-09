import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10); q.offer(20); q.offer(30);          // add
        System.out.println("Queue : " + q);
        System.out.println("peek  : " + q.peek());      // look at head, no removal
        System.out.println("poll  : " + q.poll());      // remove head
        System.out.println("Queue : " + q);
        System.out.println("peek  : " + q.peek());
    }
}
