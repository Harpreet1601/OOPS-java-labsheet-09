import java.util.LinkedList;

public class LinkedListAddEnds {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("B"); list.add("C");
        list.addFirst("A");                    // beginning
        list.addLast("D");                     // end
        System.out.println(list);
    }
}
