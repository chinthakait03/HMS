public class Payment {
    private int billId;
    private double amount;

    public Payment(int billId, double amount) {
        this.billId = billId;
        this.amount = amount;
    }

    public void makePayment() {
        System.out.println("Payment made for Bill ID: " + billId + ", Amount: $" + amount);
    }

    public void display() {
        System.out.println("Bill ID: " + billId + ", Amount: $" + amount);
    }
}
