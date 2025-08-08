package Project;

public class PatientRegistration {
    private int id;
    private String name;
    private int age;
    private String illness;

    public PatientRegistration(int id, String name, int age, String illness) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
    
    public String getIllness() {
        return illness;
    }
    
    public void displayPatientInfo() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Illness: " + illness);
    }
}
