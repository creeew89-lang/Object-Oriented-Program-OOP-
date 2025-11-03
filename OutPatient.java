package Hospital.Models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class OutPatient extends Patient {

    private int visitCount;
    private LocalDate lastVisitDate;
    private String preferredDoctorId;

    public OutPatient(String id, String firstName, String lastName,
                      LocalDate dateOfBirth, String gender,
                      String phoneNumber, String email, String address,
                      String patientId, String bloodGroup,
                      List<String> allergies, String emergencyContact,
                      LocalDate registrationDate, String insuranceId,
                      int visitCount, LocalDate lastVisitDate,
                      String preferredDoctorId) {
        super(id, firstName, lastName, dateOfBirth, gender,
                phoneNumber, email, address, patientId, bloodGroup,
                allergies, emergencyContact, registrationDate, insuranceId);
        this.visitCount = visitCount;
        this.lastVisitDate = lastVisitDate;
        this.preferredDoctorId = preferredDoctorId;
    }

    public int getVisitCount() { return visitCount; }
    public LocalDate getLastVisitDate() { return lastVisitDate; }
    public String getPreferredDoctorId() { return preferredDoctorId; }

    public void setPreferredDoctorId(String preferredDoctorId) { this.preferredDoctorId = preferredDoctorId; }

    public void scheduleFollowUp() {
        System.out.println("Follow-up scheduled for patient " + getPatientId());
    }

    public void updateVisitCount() {
        visitCount++;
        lastVisitDate = LocalDate.now();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Visit Count: " + visitCount);
        System.out.println("Last Visit Date: " + lastVisitDate);
        System.out.println("Preferred Doctor ID: " + preferredDoctorId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OutPatient)) return false;
        if (!super.equals(o)) return false;
        OutPatient that = (OutPatient) o;
        return Objects.equals(getPatientId(), that.getPatientId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPatientId());
    }
}