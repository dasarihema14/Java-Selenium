package Day5;

import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class Sort {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("Hema", 40000),
            new Employee("Ravi", 60000),
            new Employee("Meena", 30000)
        );

        list.sort(Comparator.comparing(emp -> emp.salary));

        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}

