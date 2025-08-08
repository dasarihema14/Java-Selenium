package Day3;

class Sender {
    void sendMessage() {
        System.out.println("Sending a general message");
    }
}

class EmailSender extends Sender {
    void sendMessage() {
        System.out.println("Sending an Email");
    }
}

class SMSSender extends Sender {
    void sendMessage() {
        System.out.println("Sending an SMS");
    }
}

public class Message {
    public static void main(String[] args) {
        Sender sender1 = new EmailSender();
        Sender sender2 = new SMSSender();

        sender1.sendMessage();
        sender2.sendMessage();
    }
}
