import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String address;
    private String phone;
    private List<Staff> staffList;

    public Hospital(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.staffList = new ArrayList<>();
    }

    public void addStaff(Staff staff) {
        staffList.add(staff);
        System.out.println("Added staff: " + staff.firstName);
    }

    public void displayStaffDetails() {
        System.out.println("Staff details for hospital: " + name);
        for (Staff staff : staffList) {
            staff.displayStaffDetail();
        }
    }

    public void displayDetails() {
        System.out.println("Hospital: " + name + ", Address: " + address + ", Phone: " + phone);
    }
}
