package Hospital.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Consultant extends Doctor {

    private final List<String> consultationTypes;
    private boolean onlineConsultationAvailable;
    private int consultationDuration; // minutes

    public Consultant(String id, String firstName, String lastName,
                      LocalDate dateOfBirth, String gender,
                      String phoneNumber, String email, String address,
                      String doctorId, String specialization, String qualification,
                      int experienceYears, String departmentId, double consultationFee,
                      List<String> consultationTypes, boolean onlineConsultationAvailable,
                      int consultationDuration) {
        super(id, firstName, lastName, dateOfBirth, gender,
                phoneNumber, email, address, doctorId, specialization,
                qualification, experienceYears, departmentId, consultationFee);
        this.consultationTypes = (consultationTypes == null) ? new ArrayList<>() : new ArrayList<>(consultationTypes);
        this.onlineConsultationAvailable = onlineConsultationAvailable;
        this.consultationDuration = consultationDuration;
    }

    public List<String> getConsultationTypes() { return new ArrayList<>(consultationTypes); }
    public boolean isOnlineConsultationAvailable() { return onlineConsultationAvailable; }
    public int getConsultationDuration() { return consultationDuration; }

    public void scheduleConsultation(String type) {
        if (type != null && !type.isBlank() && consultationTypes.contains(type)) {
            System.out.println("Consultation " + type + " scheduled for " + consultationDuration + " min.");
        }
    }

    public void provideSecondOpinion() {
        System.out.println("Second opinion provided by consultant " + getDoctorId());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Consultation Types: " + consultationTypes);
        System.out.println("Online Available: " + onlineConsultationAvailable);
        System.out.println("Duration: " + consultationDuration + " min");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consultant)) return false;
        if (!super.equals(o)) return false;
        Consultant that = (Consultant) o;
        return Objects.equals(getDoctorId(), that.getDoctorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDoctorId());
    }
}