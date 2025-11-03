package Hospital.Models;

import Hospital.Models.Appointment;
import Hospital.Models.MedicalRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Patient extends Person {

    private final String patientId;
    private final String bloodGroup;
    private final List<String> allergies;
    private String emergencyContact;
    private final LocalDate registrationDate;
    private String insuranceId;
    private final List<MedicalRecord> medicalRecords;
    private final List<Appointment> appointments;

    public Patient(String id, String firstName, String lastName,
                   LocalDate dateOfBirth, String gender,
                   String phoneNumber, String email, String address,
                   String patientId, String bloodGroup,
                   List<String> allergies, String emergencyContact,
                   LocalDate registrationDate, String insuranceId) {
        super(id, firstName, lastName, dateOfBirth, gender,
                phoneNumber, email, address);
        this.patientId = Objects.requireNonNull(patientId);
        this.bloodGroup = bloodGroup;
        this.allergies = (allergies == null) ? new ArrayList<>() : new ArrayList<>(allergies);
        this.emergencyContact = emergencyContact;
        this.registrationDate = Objects.requireNonNull(registrationDate);
        this.insuranceId = insuranceId;
        this.medicalRecords = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public String getPatientId() { return patientId; }
    public String getBloodGroup() { return bloodGroup; }
    public List<String> getAllergies() { return new ArrayList<>(allergies); }
    public String getEmergencyContact() { return emergencyContact; }
    public void setEmergencyContact(String emergencyContact) { this.emergencyContact = emergencyContact; }
    public LocalDate getRegistrationDate() { return registrationDate; }
    public String getInsuranceId() { return insuranceId; }
    public void setInsuranceId(String insuranceId) { this.insuranceId = insuranceId; }
    public List<MedicalRecord> getMedicalRecords() { return new ArrayList<>(medicalRecords); }
    public List<Appointment> getAppointments() { return new ArrayList<>(appointments); }

    public void addMedicalRecord(MedicalRecord record) {
        if (record != null) medicalRecords.add(record);
    }

    public void addAppointment(Appointment appointment) {
        if (appointment != null) appointments.add(appointment);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient ID: " + patientId);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Allergies: " + allergies);
        System.out.println("Emergency Contact: " + emergencyContact);
        System.out.println("Registration Date: " + registrationDate);
        System.out.println("Insurance ID: " + insuranceId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(patientId, patient.patientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), patientId);
    }
}