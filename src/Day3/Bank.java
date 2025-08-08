package Day3;

class Bank {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }else {
        	System.out.println("Invalid Amount");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount < balance) {
            balance = balance - amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}



