import java.util.*;

public class SetToList {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Red"); set.add("Green"); set.add("Blue");

        List<String> list = new ArrayList<>(set);
        for (String s : list)
            System.out.println(s);
        System.out.println("Element at index 1: " + list.get(1));
    }
}
