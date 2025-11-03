package Hospital.Models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class InPatient extends Patient {

    private final LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String roomNumber;
    private String bedNumber;
    private String admittingDoctorId;
    private double dailyCharges;

    public InPatient(String id, String firstName, String lastName,
                     LocalDate dateOfBirth, String gender,
                     String phoneNumber, String email, String address,
                     String patientId, String bloodGroup,
                     List<String> allergies, String emergencyContact,
                     LocalDate registrationDate, String insuranceId,
                     LocalDate admissionDate, String roomNumber,
                     String bedNumber, String admittingDoctorId,
                     double dailyCharges) {
        super(id, firstName, lastName, dateOfBirth, gender,
                phoneNumber, email, address, patientId, bloodGroup,
                allergies, emergencyContact, registrationDate, insuranceId);
        this.admissionDate = Objects.requireNonNull(admissionDate);
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.admittingDoctorId = admittingDoctorId;
        this.dailyCharges = dailyCharges;
    }

    public LocalDate getAdmissionDate() { return admissionDate; }
    public LocalDate getDischargeDate() { return dischargeDate; }
    public void setDischargeDate(LocalDate dischargeDate) { this.dischargeDate = dischargeDate; }
    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public String getBedNumber() { return bedNumber; }
    public void setBedNumber(String bedNumber) { this.bedNumber = bedNumber; }
    public String getAdmittingDoctorId() { return admittingDoctorId; }
    public void setAdmittingDoctorId(String admittingDoctorId) { this.admittingDoctorId = admittingDoctorId; }
    public double getDailyCharges() { return dailyCharges; }
    public void setDailyCharges(double dailyCharges) { this.dailyCharges = dailyCharges; }

    public long calculateStayDuration() {
        LocalDate end = (dischargeDate != null) ? dischargeDate : LocalDate.now();
        return java.time.temporal.ChronoUnit.DAYS.between(admissionDate, end);
    }

    public double calculateTotalCharges() {
        return calculateStayDuration() * dailyCharges;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admission Date: " + admissionDate);
        System.out.println("Discharge Date: " + dischargeDate);
        System.out.println("Room: " + roomNumber);
        System.out.println("Bed: " + bedNumber);
        System.out.println("Admitting Doctor ID: " + admittingDoctorId);
        System.out.println("Daily Charges: " + dailyCharges);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InPatient)) return false;
        if (!super.equals(o)) return false;
        InPatient that = (InPatient) o;
        return Objects.equals(getPatientId(), that.getPatientId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPatientId());
    }
}