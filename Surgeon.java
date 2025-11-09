package Hospital.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Surgeon extends Doctor {

    private int surgeriesPerformed;
    private final List<String> surgeryTypes;
    private boolean operationTheatreAccess;

    public Surgeon(String id, String firstName, String lastName,
                   LocalDate dateOfBirth, String gender,
                   String phoneNumber, String email, String address,
                   String doctorId, String specialization, String qualification,
                   int experienceYears, String departmentId, double consultationFee,
                   int surgeriesPerformed, List<String> surgeryTypes, boolean operationTheatreAccess) {
        super(id, firstName, lastName, dateOfBirth, gender,
                phoneNumber, email, address, doctorId, specialization,
                qualification, experienceYears, departmentId, consultationFee);
        this.surgeriesPerformed = surgeriesPerformed;
        this.surgeryTypes = (surgeryTypes == null) ? new ArrayList<>() : new ArrayList<>(surgeryTypes);
        this.operationTheatreAccess = operationTheatreAccess;
    }

    public int getSurgeriesPerformed() { return surgeriesPerformed; }
    public List<String> getSurgeryTypes() { return new ArrayList<>(surgeryTypes); }
    public boolean hasOperationTheatreAccess() { return operationTheatreAccess; }

    public void performSurgery(String surgeryType) {
        if (surgeryType != null && !surgeryType.isBlank()) {
            surgeriesPerformed++;
            if (!surgeryTypes.contains(surgeryType)) surgeryTypes.add(surgeryType);
        }
    }

    public void updateSurgeryCount(int count) { surgeriesPerformed = Math.max(0, count); }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Surgeries Performed: " + surgeriesPerformed);
        System.out.println("Surgery Types: " + surgeryTypes);
        System.out.println("OT Access: " + operationTheatreAccess);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Surgeon)) return false;
        if (!super.equals(o)) return false;
        Surgeon surgeon = (Surgeon) o;
        return Objects.equals(getDoctorId(), surgeon.getDoctorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDoctorId());
    }
}