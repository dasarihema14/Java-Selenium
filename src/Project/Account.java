package Project;

public class Account {

    private int accNo;
    private String accHolderName;
    private double balance;

    public Account(int accNo, String accHolderName, double balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayDetails() {
        System.out.println("Account No: " + accNo);
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}

