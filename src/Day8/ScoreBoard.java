package Day8;
import java.util.*;

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> scoreboard = new HashMap<>();
        String topScorer = null;
        int highestScore = 0;
        while(true) {

            System.out.println("\n Scoreboard Menu");
            System.out.println("1. Add Player Score");
            System.out.println("2. View Full Scoreboard");
            System.out.println("3. View Top Scorer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter score: ");
                    int score = sc.nextInt();

                    
                    scoreboard.put(name, score);

                    if (score > highestScore) {
                        highestScore = score;
                        topScorer = name;
                    }

                    System.out.println("Score added.");
                    break;

                case 2:
                    if (scoreboard.isEmpty()) {
                        System.out.println("No scores available.");
                    } else {
                        System.out.println("Scoreboard:");
                        for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) {
                            System.out.println(entry.getKey() + " : " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    if (topScorer == null) {
                        System.out.println("No scores yet.");
                    } else {
                        System.out.println(" Top Scorer: " + topScorer + " with " + highestScore + " points!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}



    	       