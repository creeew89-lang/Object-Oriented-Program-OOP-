package Hospital.Models;

import java.time.LocalDate;
import java.util.Objects;

public class GeneralPractitioner extends Doctor {

    private boolean walkinAvailable;
    private boolean homeVisitAvailable;
    private boolean vaccinationCertified;

    public GeneralPractitioner(String id, String firstName, String lastName,
                               LocalDate dateOfBirth, String gender,
                               String phoneNumber, String email, String address,
                               String doctorId, String specialization, String qualification,
                               int experienceYears, String departmentId, double consultationFee,
                               boolean walkinAvailable, boolean homeVisitAvailable,
                               boolean vaccinationCertified) {
        super(id, firstName, lastName, dateOfBirth, gender,
                phoneNumber, email, address, doctorId, specialization,
                qualification, experienceYears, departmentId, consultationFee);
        this.walkinAvailable = walkinAvailable;
        this.homeVisitAvailable = homeVisitAvailable;
        this.vaccinationCertified = vaccinationCertified;
    }

    public boolean isWalkinAvailable() { return walkinAvailable; }
    public boolean isHomeVisitAvailable() { return homeVisitAvailable; }
    public boolean isVaccinationCertified() { return vaccinationCertified; }

    public void scheduleHomeVisit() {
        if (homeVisitAvailable) System.out.println("Home visit scheduled by GP " + getDoctorId());
    }

    public void administerVaccine() {
        if (vaccinationCertified) System.out.println("Vaccine administered by GP " + getDoctorId());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Walk-in Available: " + walkinAvailable);
        System.out.println("Home Visit Available: " + homeVisitAvailable);
        System.out.println("Vaccination Certified: " + vaccinationCertified);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeneralPractitioner)) return false;
        if (!super.equals(o)) return false;
        GeneralPractitioner that = (GeneralPractitioner) o;
        return Objects.equals(getDoctorId(), that.getDoctorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDoctorId());
    }
}