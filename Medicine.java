public class Medicine {
    private String name;
    private String company;
    private String dosage;

    public Medicine(String name, String company, String dosage) {
        this.name = name;
        this.company = company;
        this.dosage = dosage;
    }

    public void consult() {
        System.out.println("Consulting for medicine: " + name);
    }

    public void displayDetails() {
        System.out.println("Medicine: " + name + ", Company: " + company + ", Dosage: " + dosage);
    }

    public String getName() {
        return "";
    }
}
