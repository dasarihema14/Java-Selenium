package wipro;

class Patient {
    private String name;
    private int age;
    private String healthIssue;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setHealthIssue(String issue) {
        healthIssue = issue;
    }

    public String getHealthIssue() {
        return healthIssue;
    }
}
