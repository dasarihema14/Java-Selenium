package Project;

public class BankMain {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(101, "Hema Dasari", 5000.0);
        System.out.println("=== Initial Account Details ===");
        account.showDetails();
        account.deposit(1500.0);
        account.withdraw(1000.0);
        System.out.println("\n=== Final Account Details ===");
        account.showDetails();
    }
}
