package Project;

public class GeneralPhysician extends DoctorDetails {

    public GeneralPhysician(String name) {
        super(name, "General Physician");
    }

    public void diagnose(PatientRegistration patient) {
        System.out.println("Dr. " + name + " (" + specialization + ") diagnoses " + patient.getName() +
                " with general treatment for: " + patient.getIllness());
    }
}

