package Day3;

class Voter {
    private String name;
    private String voterId;
    private boolean hasVoted;

    public Voter(String name, String voterId) {
        this.name = name;
        this.voterId = voterId;
        this.hasVoted = false; 
    }

    public String getName() {
        return name;
    }

    public String getVoterId() {
        return voterId;
    }

    public boolean getHasVoted() {
        return hasVoted;
    }

    public void vote() {
        if (!hasVoted) {
            hasVoted = true;
            System.out.println("Thank you for voting, " + name + "!");
        } else {
            System.out.println("You have already voted, " + name + ".");
        }
    }
}

