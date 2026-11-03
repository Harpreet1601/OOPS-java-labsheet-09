import java.util.HashSet;

public class HashSetDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("add(10): " + set.add(10));
        System.out.println("add(20): " + set.add(20));
        System.out.println("add(10) again: " + set.add(10));   // false -> duplicate rejected
        System.out.println("add(20) again: " + set.add(20));
        System.out.println("Set: " + set + "  (size = " + set.size() + ")");
    }
}
