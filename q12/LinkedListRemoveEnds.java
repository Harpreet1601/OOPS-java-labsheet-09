import java.util.LinkedList;

public class LinkedListRemoveEnds {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("C"); list.add("D");
        System.out.println("Original: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last: " + list);
    }
}
