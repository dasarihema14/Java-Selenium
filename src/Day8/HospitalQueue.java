package Day8;

import java.util.*;

public class HospitalQueue {

    public static class Patient {
        int id;
        String name;

        Patient(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "ID: " + id + ", Name: " + name;
        }
    }

    public static void main(String[] args) {
        LinkedList<Patient> queue = new LinkedList<>();
        HashSet<Integer> usedIds = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHOSPITAL QUEUE MENU:");
            System.out.println("1. Add Patient (Normal Case)");
            System.out.println("2. Add Patient (Emergency Case)");
            System.out.println("3. Remove First Patient");
            System.out.println("4. Remove Patient by Name");
            System.out.println("5. Check First Patient");
            System.out.println("6. Check Last Patient");
            System.out.println("7. Search Patient by Name");
            System.out.println("8. Total Patients");
            System.out.println("9. Remove All Patients");
            System.out.println("10. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine();
            

            switch (choice) {
                case 1: 
                    System.out.print("Enter patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    if (usedIds.contains(id)) {
                        System.out.println("Patient with ID " + id + " already exists.");
                        break;
                    }
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    queue.addLast(new Patient(id, name));
                    usedIds.add(id);
                    System.out.println(name + " added to the queue.");
                    break;

                case 2:
                    System.out.print("Enter emergency patient ID: ");
                    int eid = sc.nextInt();
                    sc.nextLine();
                    if (usedIds.contains(eid)) {
                        System.out.println(" Patient with ID " + eid + " already exists.");
                        break;
                    }
                    System.out.print("Enter emergency patient name: ");
                    String ename = sc.nextLine();
                    queue.addFirst(new Patient(eid, ename));
                    usedIds.add(eid);
                    System.out.println(ename + " added at the front (emergency).");
                    break;

                case 3: 
                    if (!queue.isEmpty()) {
                        Patient removed = queue.removeFirst();
                        usedIds.remove(removed.id);
                        System.out.println(removed.name + " has been treated and removed.");
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 4: 
                    System.out.print("Enter patient name to remove: ");
                    String rname = sc.nextLine();
                    boolean removed = false;
                    Iterator<Patient> itr = queue.iterator();
                    while (itr.hasNext()) {
                        Patient p = itr.next();
                        if (p.name.equalsIgnoreCase(rname)) {
                            itr.remove();
                            usedIds.remove(p.id);
                            System.out.println(p.name + " removed from the queue.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println(rname + " not found.");
                    }
                    break;

                case 5: 
                    if (!queue.isEmpty()) {
                        System.out.println("First patient: " + queue.getFirst());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 6: 
                    if (!queue.isEmpty()) {
                        System.out.println("Last patient: " + queue.getLast());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 7: 
                    System.out.print("Enter patient name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (Patient p : queue) {
                        if (p.name.equalsIgnoreCase(search)) {
                            System.out.println(" Found: " + p);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println(" Patient not found.");
                    }
                    break;

                case 8: 
                    System.out.println("Total patients in queue: " + queue.size());
                    break;

                case 9: 
                    queue.clear();
                    usedIds.clear();
                    System.out.println("All patient records cleared.");
                    break;

                case 10: 
                    System.out.println("Exiting... Stay healthy!");
                    //sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }while (choice!=10);
        
    }
}
