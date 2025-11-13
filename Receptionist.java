import java.util.Date;
// after add abstrct key word -- for limit abstract method
public abstract class Receptionist extends AdministrativeStaff {

    public Receptionist(
        String firstName, 
        String lastName, 
        String gender, 
        String birthDate, 
        String address, 
        String phone, 
        String bloodGroup, 
        Date joined, 
        String id,
        String designation) {
        super(firstName, lastName, gender, birthDate, address, phone, bloodGroup, joined, id ,designation);
    }

    public void confirmAppointment() {
        System.out.println("Receptionist " + firstName + " confirmed an appointment.");
    }

    public void rescheduleAppointment() {
        System.out.println("Receptionist " + firstName + " rescheduled an appointment.");
    }

    @Override
    public void displayStaffDetail() {
        System.out.println("Receptionist: " + firstName + " " + lastName + ", ID: " + id);
    }
}
