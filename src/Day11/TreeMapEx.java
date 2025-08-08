package Day11;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        
        TreeMap<String, Integer> studentMarks = new TreeMap<>();

        studentMarks.put("Ravi", 85);
        studentMarks.put("Anu", 92);
        studentMarks.put("Kiran", 76);
        studentMarks.put("Divya", 89);

        System.out.println("Student Marks (Sorted by Name):");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nMarks of Anu: " + studentMarks.get("Anu"));

        studentMarks.remove("Kiran");

        System.out.println("\nAfter removing Kiran:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nContains Ravi? " + studentMarks.containsKey("Ravi"));
        
        NavigableMap<String,Integer> descendingMap=studentMarks.descendingMap();
        System.out.println("Student Marks (Descending by Name):");
        for (Map.Entry<String, Integer> entry : descendingMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

