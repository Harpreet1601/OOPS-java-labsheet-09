import java.util.LinkedHashSet;

public class LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Zebra"); set.add("Apple"); set.add("Mango"); set.add("Banana");
        set.add("Apple");                      // duplicate ignored
        System.out.println("Insertion order kept: " + set);
    }
}
