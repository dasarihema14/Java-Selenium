package Day5;

class Display {
    int id;
    String name;
    Display(){
    	id=123;
    	name="Hema";
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Explicit {
    public static void main(String[] args) {
        Display s = new Display();  
        s.display();  
    }
}
