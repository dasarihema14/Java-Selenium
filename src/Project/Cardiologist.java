package Project;

public class Cardiologist extends DoctorDetails {

    public Cardiologist(String name) {
        super(name, "Cardiologist");
    }

    public void diagnose(PatientRegistration patient) {
        if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Dr. " + name + " (" + specialization + ") gives specialized treatment for: " + patient.getIllness());
        } else {
            System.out.println("Dr. " + name + " (" + specialization + ") recommends general check-up for: " + patient.getIllness());
        }
    }
}

