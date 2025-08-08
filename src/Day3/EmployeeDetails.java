package Day3;

import java.util.Scanner;

class Employee {
    String name, id;
    double sales;

    void getDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Sales: ");
        sales = sc.nextDouble();
        sc.nextLine(); // clear buffer
    }

    void showReport() {
        double profit = sales * 0.10;
        System.out.println("\n--- Employee Profit Report ---");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Sales  : ₹" + sales);
        System.out.println("Profit : ₹" + profit);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

    
        Employee[] empList = new Employee[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            empList[i] = new Employee(); // allocate object
            empList[i].getDetails(sc);
        }

        System.out.println("\n=== All Employee Profit Reports ===");
        for (int i = 0; i < n; i++) {
            empList[i].showReport();
        }

        sc.close();
    }
}
