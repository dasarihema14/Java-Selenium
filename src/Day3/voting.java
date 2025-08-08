package Day3;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Voter ID: ");
        String voterId = sc.nextLine();

        Voter v = new Voter(name, voterId);

        System.out.println("\nWelcome " + v.getName() + "! Ready to vote? (yes/no):");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            v.vote(); 
            v.vote(); 
        } else {
            System.out.println("You chose not to vote.");
        }

        sc.close();
    }
}

