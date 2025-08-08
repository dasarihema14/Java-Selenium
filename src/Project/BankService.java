package Project;

public interface BankService {
    void addAccount(BankAccount account);
    void showAccountDetails(int accNo);
    void depositAmount(int accNo, double amount);
    void withdrawAmount(int accNo, double amount);
}

