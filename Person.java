public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected String birthDate;
    protected String address;
    protected String phone;
    protected String bloodGroup;

    public Person(String firstName, String lastName, String gender, String birthDate, String address, String phone, String bloodGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.bloodGroup = bloodGroup;
    }

    public abstract void displayInformation();
}
