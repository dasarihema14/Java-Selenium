package wipro;

import java.util.Scanner;

class Chatbot {
    
    void say(String message) {
        if (message.isEmpty()) {
            System.out.println("Not responding");
        }
        else {
            System.out.println("Hello! I'm here to assist you");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chatbot bot = new Chatbot();

        System.out.print("");
        String message = sc.nextLine();

        bot.say(message);
        sc.close();
    }
}

