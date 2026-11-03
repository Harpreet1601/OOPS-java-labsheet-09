import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id; this.name = name; this.marks = marks;
    }

    public String toString() { return id + " | " + name + " | " + marks; }
}

public class StudentComparator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Karan", 76.0));
        list.add(new Student(1, "Aman", 82.5));
        list.add(new Student(2, "Riya", 91.0));

        // Sort by marks (ascending) using a Comparator
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return Double.compare(a.marks, b.marks);
            }
        });
        System.out.println("By marks (asc):");
        for (Student s : list) System.out.println(s);

        // Sort by name using a lambda Comparator
        list.sort((a, b) -> a.name.compareTo(b.name));
        System.out.println("By name:");
        for (Student s : list) System.out.println(s);
    }
}
