import java.util.Date;
// after add abstrct key word
public abstract class AdministrativeStaff extends Staff {
    public AdministrativeStaff(String firstName, String lastName, String gender, String birthDate, String address, String phone, String bloodGroup, Date joined, String id, String designation) {
        super(firstName, lastName, gender, birthDate, address, phone, bloodGroup, joined, id , designation);
    }


    public void manageDoctorInfo() {
        System.out.println("Administrative Staff " + firstName + " is managing doctor information.");
    }

    @Override
    public void displayStaffDetail() {
        System.out.println("Administrative Staff: " + firstName + " " + lastName + ", Designation: " + designation);
    }

    // @Override
    // public void displayInformation() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'displayInformation'");
    // }
}
