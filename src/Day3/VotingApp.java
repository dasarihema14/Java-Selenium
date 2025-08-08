package Day3;

import java.util.Scanner;

class Vote {
    private String name;
    private String voterId;
    private boolean hasVoted = false;

    public void setName(String name) {
        this.name = name;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public void vote() {
        if (!hasVoted) {
            hasVoted = true;
            System.out.println("Thanks for voting, " + name + "!");
        } else {
            System.out.println("You already voted, " + name + ".");
        }
    }
}

public class VotingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vote v = new Vote();

        System.out.print("Enter your name: ");
        v.setName(sc.nextLine());

        System.out.print("Enter your Voter ID: ");
        v.setVoterId(sc.nextLine());

        v.vote();   
        v.vote();   

        sc.close();
    }
}

