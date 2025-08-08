package Day3;
abstract class Rec {
    
    abstract double area();
}

class Rectangle extends Rec {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Area {
    public static void main(String[] args) {
       
        Rec s1 = new Rectangle(4, 6);

        System.out.println("Area of Rectangle: " + s1.area());
    }
}

