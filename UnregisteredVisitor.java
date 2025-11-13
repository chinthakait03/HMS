public class UnregisteredVisitor {
    private String firstName;
    private String lastName;
    private String visitPurpose;
    private String visitingPatientId;
    private String contactInfo;

    public UnregisteredVisitor(String firstName, String lastName, String visitPurpose, String visitingPatientId, String contactInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.visitPurpose = visitPurpose;
        this.visitingPatientId = visitingPatientId;
        this.contactInfo = contactInfo;
    }

    public void displayVisitorDetails() {
        System.out.println("Visitor: " + firstName + " " + lastName + ", Purpose: " + visitPurpose + ", Visiting Patient ID: " + visitingPatientId + ", Contact: " + contactInfo);
    }
}
