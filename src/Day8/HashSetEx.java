package Day8;

import java.util.HashSet;
import java.util.Scanner;

class PatientUser {
    int id;
    String name;

    PatientUser(int id, String name) {
        this.id = id;
        this.name = name;
    
    }
    
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class HashSetEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<PatientUser> patients = new HashSet<>();
        HashSet<Integer> registeredIds = new HashSet<>();

        int choice;
        do {
            System.out.print("\n1.Register  \n2.View  \n3.Exit\nEnter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    if (registeredIds.contains(id)) {
                        System.out.println("ID already registered.");
                    } else {
                        patients.add(new PatientUser(id, name));
                        registeredIds.add(id);
                        System.out.println("Patient registered.");
                    }
                    break;

                case 2:
                    if (patients.isEmpty())
                        System.out.println("No patients yet.");
                    else {
                        System.out.println("Registered Patients:");
                        for (PatientUser p : patients)
                            System.out.println(p);
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter ID to remove: ");
                    int removeId = sc.nextInt();
                    sc.nextLine();
                    PatientUser rem = new PatientUser(removeId, "");
                    if (patients.remove(rem)) {
                        System.out.println(" Patient with ID " + removeId + " removed.");
                    } else {
                        System.out.println(" No patient found with ID " + removeId);
                    }
                    break;


                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }
}
