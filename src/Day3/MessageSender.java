package Day3;

class MessageSender {
    void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }

    void sendMessage(String message, String recipient) {
        System.out.println("Sending message: '" + message +" " + recipient);
    }

    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        sender.sendMessage("Hello!");
        sender.sendMessage("Hi", "Hema");
    }
}
