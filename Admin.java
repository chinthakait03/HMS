import java.util.Date;

// after add abstrct key word -- for limit abstract method
public abstract class Admin extends AdministrativeStaff {

    public Admin(String firstName, String lastName, String gender, String birthDate, String address, String phone, String bloodGroup, Date joined, String id, String designation) {
        super(firstName, lastName, gender, birthDate, address, phone, bloodGroup, joined, id ,designation);
    }

    public void manageSystem() {
        System.out.println("Admin " + firstName + " is managing the hospital system.");
    }

    @Override
    public void displayStaffDetail() {
        System.out.println("Admin: " + firstName + " " + lastName + ", ID: " + id);
    }
}
