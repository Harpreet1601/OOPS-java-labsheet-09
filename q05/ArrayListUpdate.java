import java.util.ArrayList;

public class ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30);
        System.out.println("Before: " + list);
        list.set(1, 99);                       // replace element at index 1
        System.out.println("After : " + list);
    }
}
