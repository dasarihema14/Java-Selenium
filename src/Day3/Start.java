package Day3;
import java.util.Scanner;

abstract class Vehicle {
    abstract void startEngine();
}

class Bus extends Vehicle {
    void startEngine() {
        System.out.println("Bus  engine started");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started");
    }
}

public class Start {
    public static void main(String[] args) {
        Vehicle v1 = new Bus();
        Vehicle v2 = new Bike();

       /* v1.startEngine();
        v2.startEngine();*/
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the type of vehicle : ");
        String type = sc.nextLine();
        

        Vehicle v;

        if (type.equals("bus")) {
            v = new Bus();
        } else if (type.equals("bike")) {
            v = new Bike();
        } else {
            System.out.println("Invalid vehicle type");
            return;
        }

        v.startEngine();
    }
}
