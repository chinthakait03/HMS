import java.util.Date;

public class HospitalManagementSystem {
    public static void main(String[] args) {



        // Create instances of different staff members

        Doctor doctor = new Doctor("Palinda", "Bandara", "Male", "1975-06-20", "456 Danapal Road , Colombo", " 076 - 3018292 ", "O+", new Date(), "D001", "Cardiology", "MBBS, MD") {
            @Override
            public void displayInformation() {

            }
        };


        Receptionist receptionist = new Receptionist("Kalana", "Dananjaya", "male", "1985-07-25", "789 Lotas Road , Wadduwa", "077-2345676", "B+", new Date(), "R001" , "dgg") {
            @Override
            public void displayInformation() {
            }
        };



        LabAssistant labAssistant = new LabAssistant("Kavindi", "Disanayaka", "Female", "1999-03-10", "789 Seth Guna Road ,Panadura", "077-7534799", "A+", new Date(), "L001") {
            @Override
            public void displayInformation() {

            }
        };

       
       
        
        // Create Patient
        Patient patient = new Patient("Nuwan", "Widarshana", "male", 
        "1998-07-15", "789 2nd lane , Molligoda ,Wadduwa",  "0756712222", "A+", "alice@gmail.com", "H12345" );



        // Medicine and Prescription
        Medicine medicine = new Medicine("Aspirin", "Bayer", "500mg");


        Prescription prescription = new Prescription(101, "Aspirin 500mg", "Take twice a day");


        // Lab test
        LabTest labTest = new LabTest("Blood Test", "Normal");


        // Payment
        Payment payment = new Payment(1, 200.0);


        // Display information
        doctor.displayStaffDetail();
        receptionist.displayStaffDetail();
        labAssistant.displayStaffDetail();
        
        patient.displayInformation();

        // Operations
        doctor.prescribeMedication(patient, "Aspirin 500mg");
        receptionist.confirmAppointment();
        labAssistant.generateReport();

        
        // Additional displays
        medicine.displayDetails();
        prescription.display();
        labTest.displayTestResult();
        payment.display();
    }
}
