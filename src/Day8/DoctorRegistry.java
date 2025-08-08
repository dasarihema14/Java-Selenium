package Day8;

import java.util.*;

class Doctor {
    int licenseNumber;
    String name;
    String department;

    Doctor(int licenseNumber, String name, String department) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return "License: " + licenseNumber + ", Name: " + name + ", Dept: " + department;
    }
}

public class DoctorRegistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Doctor> doctorMap = new HashMap<>();
        int choice;

        do {
            System.out.println("\n=== Doctor Registry Menu ===");
            System.out.println("1. Add New Doctor");
            System.out.println("2. Display All Doctors");
            System.out.println("3. Search Doctor by License Number");
            System.out.println("4. Remove Doctor by License Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter License Number: ");
                    int license = sc.nextInt();
                    sc.nextLine();
                    if (doctorMap.containsKey(license)) {
                        System.out.println(" Doctor already registered with this license number!");
                        break;
                    }
                    System.out.print("Enter Doctor Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    Doctor newDoc = new Doctor(license, name, dept);
                    doctorMap.put(license, newDoc);
                    System.out.println("Doctor registered successfully.");
                    break;

                case 2:
                    if (doctorMap.isEmpty()) {
                        System.out.println(" No doctors registered yet.");
                    } else {
                        System.out.println(" All Registered Doctors:");
                        for (Doctor d : doctorMap.values()) {
                            System.out.println(d);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter License Number to Search: ");
                    int searchId = sc.nextInt();
                    Doctor found = doctorMap.get(searchId);
                    if (found != null) {
                        System.out.println(" Doctor Found: " + found);
                    } else {
                        System.out.println("Doctor not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter License Number to Remove: ");
                    int removeId = sc.nextInt();
                    Doctor removed = doctorMap.remove(removeId);
                    if (removed != null) {
                        System.out.println("Doctor removed: " + removed.name);
                    } else {
                        System.out.println("Doctor not found.");
                    }
                    break;

                case 5:
                    System.out.println(" Exiting system... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
