package Hospital.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Nurse extends Person {

    private final String nurseId;
    private final String departmentId;
    private String shift;
    private final String qualification;
    private final List<Patient> assignedPatients;

    public Nurse(String id, String firstName, String lastName,
                 LocalDate dateOfBirth, String gender,
                 String phoneNumber, String email, String address,
                 String nurseId, String departmentId,
                 String shift, String qualification) {
        super(id, firstName, lastName, dateOfBirth, gender,
                phoneNumber, email, address);
        this.nurseId = Objects.requireNonNull(nurseId);
        this.departmentId = departmentId;
        this.shift = shift;
        this.qualification = qualification;
        this.assignedPatients = new ArrayList<>();
    }

    public String getNurseId() { return nurseId; }
    public String getDepartmentId() { return departmentId; }
    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }
    public String getQualification() { return qualification; }
    public List<Patient> getAssignedPatients() { return new ArrayList<>(assignedPatients); }

    public void assignPatient(Patient patient) {
        if (patient != null && !assignedPatients.contains(patient)) {
            assignedPatients.add(patient);
        }
    }

    public void removePatient(Patient patient) {
        assignedPatients.remove(patient);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Nurse ID: " + nurseId);
        System.out.println("Department ID: " + departmentId);
        System.out.println("Shift: " + shift);
        System.out.println("Qualification: " + qualification);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nurse)) return false;
        if (!super.equals(o)) return false;
        Nurse nurse = (Nurse) o;
        return Objects.equals(nurseId, nurse.nurseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nurseId);
    }
}