package Day5;

class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Implicit {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();  
    }
}

