package Hospital.Services;

import Hospital.Models.Medicine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PharmacyService {

    private final List<Medicine> medicines = new ArrayList<>();

    public void addMedicine(Medicine medicine) {
        if (medicine != null) {
            medicines.add(medicine);
        }
    }

    public void editMedicine(String medicineId, Medicine updatedMedicine) {
        if (medicineId == null || updatedMedicine == null) return;

        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getMedicineId().equals(medicineId)) {
                medicines.set(i, updatedMedicine);
                return;
            }
        }
    }

    public void removeMedicine(String medicineId) {
        if (medicineId == null) return;

        medicines.removeIf(med -> med.getMedicineId().equals(medicineId));
    }

    public Medicine getMedicineById(String medicineId) {
        if (medicineId == null) return null;

        for (Medicine med : medicines) {
            if (med.getMedicineId().equals(medicineId)) {
                return med;
            }
        }
        return null;
    }

    public void displayAllMedicines() {
        if (medicines.isEmpty()) {
            System.out.println("No medicines found.");
            return;
        }

        for (Medicine med : medicines) {
            System.out.println("-----");
            med.displayInfo();
        }
    }

    public List<Medicine> getMedicinesByType(String type) {
        if (type == null) return new ArrayList<>();

        return medicines.stream()
                .filter(med -> type.equalsIgnoreCase(med.getType()))
                .collect(Collectors.toList());
    }

    public List<Medicine> getMedicinesByExpiry(String expiryDate) {
        if (expiryDate == null) return new ArrayList<>();

        return medicines.stream()
                .filter(med -> expiryDate.equalsIgnoreCase(med.getExpiryDate()))
                .collect(Collectors.toList());
    }
}