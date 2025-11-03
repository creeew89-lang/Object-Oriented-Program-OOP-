package Hospital.Models;

import Hospital.Models.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Doctor extends Person {

    private final String doctorId;
    private final String specialization;
    private final String qualification;
    private final int experienceYears;
    private final String departmentId;
    private double consultationFee;
    private final List<String> availableSlots;
    private final List<Patient> assignedPatients;

    public Doctor(String id, String firstName, String lastName,
                  LocalDate dateOfBirth, String gender,
                  String phoneNumber, String email, String address,
                  String doctorId, String specialization, String qualification,
                  int experienceYears, String departmentId, double consultationFee) {
        super(id, firstName, lastName, dateOfBirth, gender,
                phoneNumber, email, address);
        this.doctorId = Objects.requireNonNull(doctorId);
        this.specialization = specialization;
        this.qualification = qualification;
        this.experienceYears = experienceYears;
        this.departmentId = departmentId;
        this.consultationFee = consultationFee;
        this.availableSlots = new ArrayList<>();
        this.assignedPatients = new ArrayList<>();
    }

    public String getDoctorId() { return doctorId; }
    public String getSpecialization() { return specialization; }
    public String getQualification() { return qualification; }
    public int getExperienceYears() { return experienceYears; }
    public String getDepartmentId() { return departmentId; }
    public double getConsultationFee() { return consultationFee; }
    public void setConsultationFee(double fee) { this.consultationFee = fee; }
    public List<String> getAvailableSlots() { return new ArrayList<>(availableSlots); }
    public List<Patient> getAssignedPatients() { return new ArrayList<>(assignedPatients); }

    public void assignPatient(Patient patient) {
        if (patient != null && !assignedPatients.contains(patient)) {
            assignedPatients.add(patient);
        }
    }

    public void removePatient(Patient patient) {
        assignedPatients.remove(patient);
    }

    public void updateAvailability(List<String> newSlots) {
        availableSlots.clear();
        if (newSlots != null) availableSlots.addAll(newSlots);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Specialization: " + specialization);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("Department ID: " + departmentId);
        System.out.println("Consultation Fee: " + consultationFee);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(doctorId, doctor.doctorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctorId);
    }
}