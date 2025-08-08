package Project;

public class ImpService implements PatientService {
    private PatientRegistration[] patients = new PatientRegistration[100];
    private int count = 0; 

    public void addPatient(PatientRegistration patient) {
        if (count < patients.length) {
            patients[count] = patient;
            count++;
        } else {
            System.out.println("Cannot add more patients. Storage is full.");
        }
    }
    
    public void displayDetails(int patientId) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (patients[i].getId() == patientId) {
                patients[i].displayPatientInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No patient found with ID: " + patientId);
        }
    }
}

