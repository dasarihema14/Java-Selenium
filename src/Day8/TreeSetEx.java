package Day8;

import java.util.TreeSet;
import java.util.NavigableSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<>();

        students.add("Ravi");
        students.add("Anjali");
        students.add("Zara");
        students.add("Kiran");
        students.add("Anjali"); 

        System.out.println("Students in ascending order:");
        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("\nStudents in descending order:");
        NavigableSet<String> reverseStudents = students.descendingSet();
        for (String name : reverseStudents) {
            System.out.println(name);
        }
    }
}


