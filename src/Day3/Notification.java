package Day3;

abstract class NotificationSystem {
    abstract void notifyUser();
}

class EmailNotification extends NotificationSystem {
    void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends NotificationSystem {
    void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification extends NotificationSystem {
    void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}

public class Notification {
    public static void main(String[] args) {
        NotificationSystem n1 = new EmailNotification();
        NotificationSystem n2 = new SMSNotification();
        NotificationSystem n3 = new PushNotification();

        n1.notifyUser();
        n2.notifyUser();
        n3.notifyUser();
    }
}
