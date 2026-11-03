import java.util.LinkedList;

public class LinkedListGetEnds {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("C");
        System.out.println("First: " + list.getFirst());
        System.out.println("Last : " + list.getLast());
        System.out.println("List unchanged: " + list);
    }
}
