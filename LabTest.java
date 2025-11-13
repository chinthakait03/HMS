public class LabTest {
    private String testName;
    private String result;

    public LabTest(String testName, String result) {
        this.testName = testName;
        this.result = result;
    }

    public void display() {
        System.out.println("Lab Test: " + testName + ", Result: " + result);
    }

    public void displayTestResult() {

        System.out.println("Test name: " + testName + ", result: " + result);
    }
}
