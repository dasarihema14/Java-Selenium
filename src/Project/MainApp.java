package Project;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        
       /* PatientRegistration p1 = new PatientRegistration(101, "Honey", 45, "Fever");
        PatientRegistration p2 = new PatientRegistration(102, "Bunny", 60, "Heart Pain");

        PatientService service = new ImpService();
        service.addPatient(p1);
        service.addPatient(p2);

        System.out.println("=== Patient Details ===");
        service.displayDetails(101);
        service.displayDetails(102);

        DoctorDetails general = new GeneralPhysician("Dr. Smith");
        DoctorDetails cardio = new Cardiologist("Dr. Mehra");

        System.out.println("\n=== Diagnosis ===");
        general.diagnose(p1);
        cardio.diagnose(p2);*/
 
        PatientService service = new ImpService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for first patient:");
        System.out.print("ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Age: ");
        int age1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Illness: ");
        String illness1 = sc.nextLine();
        PatientRegistration p1 = new PatientRegistration(id1, name1, age1, illness1);

        System.out.println("\nEnter details for second patient:");
        System.out.print("ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Age: ");
        int age2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Illness: ");
        String illness2 = sc.nextLine();
        PatientRegistration p2 = new PatientRegistration(id2, name2, age2, illness2);

        service.addPatient(p1);
        service.addPatient(p2);

        System.out.println("\n=== Patient Details ===");
        service.displayDetails(id1);
        service.displayDetails(id2);

        DoctorDetails general = new GeneralPhysician("Dr. Smith");
        DoctorDetails cardio = new Cardiologist("Dr. Mehra");

        System.out.println("\n=== Diagnosis ===");
        general.diagnose(p1);
        cardio.diagnose(p2);

        sc.close();
   
    }
}
