package wipro;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Patient p = new Patient();

        /*p.setName("Happy");
        p.setAge(23);
        p.setHealthIssue("High Blood Pressure");

        System.out.println("Patient Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Health Issue: " + p.getHealthIssue());*/
        
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter patient name: ");
        p.setName(sc.nextLine());

        System.out.print("Enter age: ");
        p.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter health issue: ");
        p.setHealthIssue(sc.nextLine());

        System.out.println("\n--- Patient Record ---");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Health Issue: " + p.getHealthIssue());

        sc.close();
            }

        }
       


