package Day8;

import java.util.*;

class Patient1 {
    private int id;
    private String name;
    private String disease;

    public Patient1(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Disease: " + disease;
    }
}

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, Patient1> patientMap = new HashMap<>();

        patientMap.put(101, new Patient1(101, "Renu", "Cold"));
        patientMap.put(102, new Patient1(102, "Sai", "Fever"));
        patientMap.put(103, new Patient1(103, "Mahasa", "Flu"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hospital Patient System ---");
            System.out.println("1. Display Patients");
            System.out.println("2. Get Patient By ID");
            System.out.println("3. Update Patient Disease");
            System.out.println("4. Remove Patient By ID");
            System.out.println("5. Check if Map is Empty");
            System.out.println("6. Display All Patients");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
            case 1:
               
                System.out.println("Displaying added patients:");
                for (Patient1 p : patientMap.values()) {
                    System.out.println(p);
                }
                break;

                case 2:
                    System.out.print("Enter Patient ID to retrieve: ");
                    int searchId = sc.nextInt();
                    if (patientMap.containsKey(searchId)) {
                        System.out.println(patientMap.get(searchId));
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine(); 
                    if (patientMap.containsKey(updateId)) {
                        System.out.print("Enter new disease: ");
                        String newDisease = sc.nextLine();
                        patientMap.get(updateId).setDisease(newDisease);
                        System.out.println("Disease updated.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Patient ID to remove: ");
                    int removeId = sc.nextInt();
                    if (patientMap.remove(removeId) != null) {
                        System.out.println("Patient removed.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 5:
                    System.out.println("Is patient map empty? " + patientMap.isEmpty());
                    break;

                case 6:
                    System.out.println("\nAll Registered Patients:");
                    for (Patient1 p : patientMap.values()) {
                        System.out.println(p);
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}
