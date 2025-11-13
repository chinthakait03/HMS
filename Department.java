public class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDetails() {
        System.out.println("Department: " + departmentName);
    }
}
