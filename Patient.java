import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private String email;
    
    private String healthInsuranceID;
    private List<Prescription> prescriptions;
    private List<LabTest> labTests;

    public Patient(String firstName, String lastName, String gender, String birthDate, String address, String phone, String bloodGroup, String email, String healthInsuranceID) {
        super(firstName, lastName, gender, birthDate, address, phone, bloodGroup);

        this.email = email;
        this.healthInsuranceID = healthInsuranceID;
        this.prescriptions = new ArrayList<>();
        this.labTests = new ArrayList<>();
    }

    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    public void viewPrescriptions() {
        System.out.println("Prescriptions for " + firstName + ":");
        for (Prescription prescription : prescriptions) {
            prescription.display();
        }
    }

    @Override
    public void displayInformation() {
        System.out.println("Patient: " + firstName + " " + lastName + ", Email: " + email + ", Health Insurance ID: " + healthInsuranceID + "labTests : " + labTests);
    }

    public String getFirstName() {
        return "";
    }
}
