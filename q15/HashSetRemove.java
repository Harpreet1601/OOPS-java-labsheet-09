import java.util.HashSet;

public class HashSetRemove {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1); set.add(2); set.add(3); set.add(4);
        System.out.println("Before: " + set);
        System.out.println("remove(3): " + set.remove(3));
        System.out.println("remove(99): " + set.remove(99));   // not present -> false
        System.out.println("After : " + set);
    }
}
