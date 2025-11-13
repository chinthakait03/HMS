import java.util.Date;

public abstract class Staff extends Person {
    protected Date joined;
    protected String id;
    protected String designation;

    public Staff(String firstName, String lastName, String gender, String birthDate, String address, String phone, String bloodGroup, Date joined, String id, String designation) {
        super(firstName, lastName, gender, birthDate, address, phone, bloodGroup);
        this.joined = joined;
        this.id = id;
        this.designation = designation;
    }

    public abstract void displayStaffDetail();

    public void addStaff() {
        System.out.println("Adding staff member: " + firstName + " " + lastName);
    }
    
    public void removeStaff() {
        System.out.println("Removing staff member: " + firstName + " " + lastName);
    }

    public void updateDetails() {
        System.out.println("Updating details for staff member: " + firstName + " " + lastName);
    }
}
