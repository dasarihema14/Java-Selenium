package Project;

public abstract class DoctorDetails {
    protected String name;
    protected String specialization;

    public DoctorDetails(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public abstract void diagnose(PatientRegistration patient);
}

