import java.util.Date;

public abstract  class Pharmacist extends Staff {
    private String licenseNumber;

    public Pharmacist(String firstName, String lastName, String gender, String birthDate, String address, String phone, String bloodGroup, Date joined, String id, String licenseNumber) {
        super(firstName, lastName, gender, birthDate, address, phone, bloodGroup, joined, id, "Pharmacist");
        this.licenseNumber = licenseNumber;
    }

    // Method to manage inventory of medicines
    public void manageInventory(Medicine medicine, int quantity) {
        System.out.println("Pharmacist " + firstName + " updated inventory for " + medicine.getName() + " with quantity " + quantity);
    }

    // Method to dispense medication to patients
    public void dispenseMedication(Patient patient, Prescription prescription) {
        System.out.println("Pharmacist " + firstName + " dispensed " + prescription.getMedicineDetails() + " to patient " + patient.getFirstName());
    }

    @Override
    public void displayStaffDetail() {
        System.out.println("Pharmacist: " + firstName + " " + lastName + ", License Number: " + licenseNumber);
    }
}
