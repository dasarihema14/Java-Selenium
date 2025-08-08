package wipro;

import java.util.Scanner;
abstract class Remote {
    abstract void turnOn();
    abstract void turnOff();
}

class FanRemote extends Remote {
    void turnOn() {
        System.out.println("Fan is turned ON");
    }
    void turnOff() {
        System.out.println("Fan is turned OFF");
    }
}

class LightRemote extends Remote {
    void turnOn() {
        System.out.println("Light is turned ON");
    }
    void turnOff() {
        System.out.println("Light is turned OFF");
    }
}



public class Control{
    public static void main(String[] args) {
        Remote fan = new FanRemote();
        Remote light = new LightRemote();

        /*fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose device: 1. Fan  2. Light");
        int deviceChoice = scanner.nextInt();

        Remote remote;

        if (deviceChoice == 1) {
            remote = new FanRemote();
        } else {
            remote = new LightRemote();
        }

        System.out.println("Choose action: 1. Turn ON  2. Turn OFF");
        int actionChoice = scanner.nextInt();

        if (actionChoice == 1) {
            remote.turnOn();
        } else {
            remote.turnOff();
        }

        scanner.close();
    }


    }





