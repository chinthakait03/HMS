public class Diagnose {
    private String diagnosisType;

    public Diagnose(String diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    public void diagnose() {
        System.out.println("Diagnosis type: " + diagnosisType);
    }
}
