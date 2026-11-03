import java.util.TreeSet;

public class TreeSetContains {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5); set.add(15); set.add(25);
        System.out.println("Set: " + set);
        System.out.println("contains(15): " + set.contains(15));
        System.out.println("contains(100): " + set.contains(100));
    }
}
