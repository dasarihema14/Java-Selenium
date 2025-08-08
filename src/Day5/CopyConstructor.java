package Day5;

class Copy {
    int id;
    String name;

    Copy(int i, String n) {
        id = i;
        name = n;
    }

    Copy(Copy s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Copy s1 = new Copy(101, "Hema");
        Copy s2 = new Copy(s1); 

        s1.display();  
        s2.display();  
    }
}

