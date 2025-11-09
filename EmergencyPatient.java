package Hospital.Models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class EmergencyPatient extends InPatient {

    private String emergencyType;
    private String arrivalMode;
    private int triageLevel;
    private boolean admittedViaER;

    public EmergencyPatient(String id, String firstName, String lastName,
                            LocalDate dateOfBirth, String gender,
                            String phoneNumber, String email, String address,
                            String patientId, String bloodGroup,
                            List<String> allergies, String emergencyContact,
                            LocalDate registrationDate, String insuranceId,
                            LocalDate admissionDate, String roomNumber,
                            String bedNumber, String admittingDoctorId,
                            double dailyCharges,
                            String emergencyType, String arrivalMode,
                            int triageLevel, boolean admittedViaER) {
        super(id, firstName, lastName, dateOfBirth, gender,
                phoneNumber, email, address, patientId, bloodGroup,
                allergies, emergencyContact, registrationDate, insuranceId,
                admissionDate, roomNumber, bedNumber, admittingDoctorId, dailyCharges);
        this.emergencyType = emergencyType;
        this.arrivalMode = arrivalMode;
        this.triageLevel = triageLevel;
        this.admittedViaER = admittedViaER;
    }

    public String getEmergencyType() { return emergencyType; }
    public void setEmergencyType(String emergencyType) { this.emergencyType = emergencyType; }
    public String getArrivalMode() { return arrivalMode; }
    public void setArrivalMode(String arrivalMode) { this.arrivalMode = arrivalMode; }
    public int getTriageLevel() { return triageLevel; }
    public void setTriageLevel(int triageLevel) { this.triageLevel = triageLevel; }
    public boolean isAdmittedViaER() { return admittedViaER; }
    public void setAdmittedViaER(boolean admittedViaER) { this.admittedViaER = admittedViaER; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Emergency Type: " + emergencyType);
        System.out.println("Arrival Mode: " + arrivalMode);
        System.out.println("Triage Level: " + triageLevel);
        System.out.println("Admitted via ER: " + admittedViaER);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmergencyPatient)) return false;
        if (!super.equals(o)) return false;
        EmergencyPatient that = (EmergencyPatient) o;
        return Objects.equals(getPatientId(), that.getPatientId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPatientId());
    }
}