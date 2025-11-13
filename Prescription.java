
public class Prescription {
    private int prescriptionId;
    private String medicineDetails;
    private String advice;

    public Prescription(int prescriptionId, String medicineDetails, String advice) {
        this.prescriptionId = prescriptionId;
        this.medicineDetails = medicineDetails;
        this.advice = advice;
    }

    public void display() {
        System.out.println("Prescription ID: " + prescriptionId + ", Medicine: " + medicineDetails + ", Advice: " + advice);
    }

    public String getMedicineDetails() {
        return "";
    }
}
