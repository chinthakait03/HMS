import java.util.Date;

public abstract class LabAssistant extends Staff {
    public LabAssistant(String firstName, String lastName, String gender, String birthDate, String address, String phone, String bloodGroup, Date joined, String id) {
        super(firstName, lastName, gender, birthDate, address, phone, bloodGroup, joined, id, "Lab Assistant");
    }

    public void generateReport() {
        System.out.println("Lab Assistant " + firstName + " generated a report.");
    }

    public void showTestResult() {
        System.out.println("Lab Assistant " + firstName + " displayed test results.");
    }

    public void managePatientBilling() {
        System.out.println("Lab Assistant " + firstName + " is managing patient billing.");
    }

    @Override
    public void displayStaffDetail() {
        System.out.println("Lab Assistant: " + firstName + " " + lastName);
    }
}
