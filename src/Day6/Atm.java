package Day6;
import java.util.Scanner;

public class Atm {

    static void verifyPin(int pin) throws Exception {
        int correctPin = 1234;

        if (pin != correctPin) {
            throw new Exception("Invalid PIN entered.");
        }

        System.out.println("PIN verified. Access granted.");
        System.out.println("Select type");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("User inserts card.");
        System.out.print("Enter your PIN: ");
        int userPin = scanner.nextInt(); 

        try {
            verifyPin(userPin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction has been logged.");
        }

        scanner.close(); 
    }
}


