import java.util.*;

public class SetComparison {
    public static void main(String[] args) {
        String[] data = {"Mango", "Apple", "Banana", "Cherry", "Apple"};

        Set<String> hash = new HashSet<>();
        Set<String> linked = new LinkedHashSet<>();
        Set<String> tree = new TreeSet<>();
        for (String s : data) { hash.add(s); linked.add(s); tree.add(s); }

        System.out.println("HashSet       (no guaranteed order): " + hash);
        System.out.println("LinkedHashSet (insertion order)    : " + linked);
        System.out.println("TreeSet       (sorted order)       : " + tree);
    }
}
