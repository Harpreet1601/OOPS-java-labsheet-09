import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30); list.add(40); list.add(50);
        System.out.println("Original: " + list);

        list.remove(1);                        // by index -> removes 20
        System.out.println("After remove(index 1): " + list);

        list.remove(Integer.valueOf(40));      // by value -> removes 40
        System.out.println("After remove(value 40): " + list);
    }
}
