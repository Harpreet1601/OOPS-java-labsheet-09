import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4));
        System.out.println("List (with duplicates): " + list + "  size=" + list.size());

        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set  (duplicates gone): " + set + "  size=" + set.size());
    }
}
