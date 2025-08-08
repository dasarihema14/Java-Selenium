package Day8;

import java.util.*;

class Patient {
    private String name;
    private int age;
    private String problem;

    public Patient(String name, int age, String problem) {
        this.name = name;
        this.age = age;
        this.problem = problem;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Problem: " + problem);
    }
}

public class Collection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<PatientList> opdList = new ArrayList<>();

        int choice;
        while (true) {
            System.out.println("\n--- Hospital OPD System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. List All Patients");
            System.out.println("3. Search Patient by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Problem: ");
                    String problem = sc.nextLine();

                    opdList.add(new PatientList(name, age, problem));
                    System.out.println("Patient added successfully.");
                    break;

                case 2:
                    if (opdList.isEmpty()) {
                        System.out.println("No patients to display.");
                    } else {
                        System.out.println("\n--- List of All Patients ---");
                        for (PatientList p : opdList) {
                            p.displayInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (PatientList p : opdList) {
                        if (p.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Patient found:");
                            p.displayInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Patient with name '" + searchName + "' not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    sc.close();
            }
            
        } 

        
    }
    
}

