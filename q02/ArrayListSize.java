import java.util.ArrayList;

public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); list.add(15); list.add(25);
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }
}
