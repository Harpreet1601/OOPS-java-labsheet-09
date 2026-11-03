import java.util.LinkedList;

public class LinkedListPrint {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Delhi"); list.add("Mumbai"); list.add("Agra");
        for (String s : list)
            System.out.println(s);
        System.out.println("List: " + list);
    }
}
