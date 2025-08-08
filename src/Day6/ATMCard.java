package Day6;

import java.util.Scanner;

class InvalidPinException extends Exception {
    InvalidPinException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class ATMCard {
    static int[] pins = {1111, 2222};
    static double[] balances = {5000.0, 3000.0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = -1;

        try {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();
            for (int i = 0; i < pins.length; i++) {
                if (enteredPin == pins[i]) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                throw new InvalidPinException("Incorrect PIN.");
            }

            int choice;
            do {
                System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: ₹" + balances[index]);
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();
                        balances[index] += deposit;
                        System.out.println("Deposited ₹" + deposit + ". New Balance: ₹" + balances[index]);
                        break;
                    case 3:
                        System.out.print("Enter withdraw amount: ");
                        double withdraw = sc.nextDouble();
                        if (withdraw > balances[index]) {
                            throw new InsufficientBalanceException("Not enough balance.");
                        }
                        balances[index] -= withdraw;
                        System.out.println("Withdrawn ₹" + withdraw + ". New Balance: ₹" + balances[index]);
                        break;
                    case 4:
                        System.out.println("Thank you for banking with us!");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } while (choice != 4);

        } catch (InvalidPinException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            System.out.println("Transaction session ended.");
            sc.close();
        }
    }
}
