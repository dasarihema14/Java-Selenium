package Project;

public class Implementation implements BankService {

    BankAccount account;

    public void addAccount(BankAccount acc) {
        account = acc;
    }

    public void showAccountDetails(int accNo) {
        if (account != null && account.getAccNo() == accNo) {
            account.showDetails();
        } else {
            System.out.println("Account not found.");
        }
    }

    public void depositAmount(int accNo, double amount) {
        if (account != null && account.getAccNo() == accNo) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawAmount(int accNo, double amount) {
        if (account != null && account.getAccNo() == accNo) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
}

