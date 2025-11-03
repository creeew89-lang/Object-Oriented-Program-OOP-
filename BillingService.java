package Hospital.Services;

import Hospital.Models.Bill;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BillingService {

    private final List<Bill> bills = new ArrayList<>();

    public void addBill(Bill bill) {
        if (bill != null) bills.add(bill);
    }

    public void editBill(String billId, Bill updatedBill) {
        if (billId == null || updatedBill == null) return;
        for (int i = 0; i < bills.size(); i++) {
            if (billId.equals(bills.get(i).getBillId())) {
                bills.set(i, updatedBill);
                return;
            }
        }
    }

    public void removeBill(String billId) {
        if (billId != null) bills.removeIf(b -> billId.equals(b.getBillId()));
    }

    public Bill getBillById(String billId) {
        if (billId == null) return null;
        return bills.stream().filter(b -> billId.equals(b.getBillId())).findFirst().orElse(null);
    }

    public void displayAllBills() {
        if (bills.isEmpty()) {
            System.out.println("No bills found.");
            return;
        }
        bills.forEach(Bill::displayInfo);
    }

    public List<Bill> getBillsByPatient(String patientId) {
        if (patientId == null) return new ArrayList<>();
        return bills.stream().filter(b -> patientId.equalsIgnoreCase(b.getPatientId())).collect(Collectors.toList());
    }

    public List<Bill> getBillsByStatus(String status) {
        if (status == null) return new ArrayList<>();
        return bills.stream().filter(b -> status.equalsIgnoreCase(b.getPatientId())).collect(Collectors.toList());
    }
}