package Hospital.interfaces;

public interface Billable {
    double calculateCharges();
    void generateBill();
    void processPayment(double amount);
}