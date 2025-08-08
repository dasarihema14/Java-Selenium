package Day3;

abstract class Pay {
    abstract void makePayment();
}

class CreditCardPayment extends Pay {
    void makePayment() {
        System.out.println("Payment is successfull using Credit Card.");
    }
}

class UPIPayment extends Pay {
    void makePayment() {
        System.out.println("Payment is successfull using UPI.");
    }
}

public class Payment {
    public static void main(String[] args) {
        Pay p1 = new CreditCardPayment();
        Pay p2 = new UPIPayment();

        p1.makePayment();
        p2.makePayment();
    }
}