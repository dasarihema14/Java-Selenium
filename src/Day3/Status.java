package Day3;
import java.util.Scanner;

public class Status {
	public static void main(String[] args) {
		Car c= new Car();
		/*c.setSpeed(50.5);
		c.setengineStatus("Start");
		c.setfuel(30);
		System.out.println("Speed : " + c.getSpeed() + " kmph");
		System.out.println("Engine Status : " + c.getengineStatus());
		System.out.println("FuelLevel : " + c.getfuel());*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Car Speed :");
		double s=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Engine Status :");
		String engineStatus=sc.nextLine();
		
		System.out.println("Fuel level :");
		int fuellevel = sc.nextInt();
		
		c.setSpeed(s);
        c.setengineStatus(engineStatus);
        c.setfuel(fuellevel);

        
        System.out.println("\n--- Car Status ---");
        System.out.println("Speed : " + c.getSpeed() + " kmph");
        System.out.println("Engine Status : " + c.getengineStatus());
        System.out.println("Fuel Level : " + c.getfuel() + " liters");

        sc.close();
		
		
		
		
	}

}
