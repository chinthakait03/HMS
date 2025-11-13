import java.util.Date;


// after add abstrct key word -- for limit abstract method
public abstract class Doctor extends Staff {
    private final String specialization;
    private final String qualifications;

    public Doctor(
        String firstName,
        String lastName,
        String gender, 
        String birthDate, 
        String address, 
        String phone, 
        String bloodGroup, 
        Date joined, 
        String id, 
        String specialization, 
        String qualifications ) {

        super(firstName, lastName, gender, birthDate, address, phone, bloodGroup, joined, id, "Doctor");
        
        this.specialization = specialization;
        this.qualifications = qualifications;
    }

    public void prescribeMedication(Patient patient, String medication) {
        System.out.println("Doctor " + firstName + " prescribed " + medication + " for " + patient.firstName);
    }

    public void scheduleAppointment() {
        System.out.println("Doctor " + firstName + " scheduled an appointment.");
    }

    public void displaySchedule() {
        System.out.println("Doctor " + firstName + "'s schedule displayed.");
    }

    @Override
    public void displayStaffDetail() {
        System.out.println("Doctor: " + firstName + " " + lastName + ", Specialization: " + specialization + ", Qualifications: " + qualifications);
    }
}
