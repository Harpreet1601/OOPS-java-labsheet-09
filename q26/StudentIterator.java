import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id; this.name = name; this.marks = marks;
    }

    public String toString() { return id + " | " + name + " | " + marks; }
}

public class StudentIterator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Aman", 82.5));
        list.add(new Student(2, "Riya", 91.0));
        list.add(new Student(3, "Karan", 76.0));

        Iterator<Student> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
