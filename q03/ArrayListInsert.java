import java.util.ArrayList;

public class ArrayListInsert {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(40);
        System.out.println("Before: " + list);
        list.add(2, 30);                       // insert 30 at index 2
        System.out.println("After : " + list);
    }
}
