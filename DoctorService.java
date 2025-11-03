package Hospital.Services;

import Hospital.Models.Doctor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DoctorService{

    private static final DoctorService INSTANCE = new DoctorService();
    private final List<Doctor> doctors = new ArrayList<>();

    public static DoctorService getInstance() { return INSTANCE; }
    private DoctorService() {}

    public void addDoctor(Doctor doctor) {
        if (doctor != null) doctors.add(doctor);
    }

    public void editDoctor(String doctorId, Doctor updated) {
        if (doctorId == null || updated == null) return;
        for (int i = 0; i < doctors.size(); i++) {
            if (doctorId.equals(doctors.get(i).getDoctorId())) {
                doctors.set(i, updated);
                return;
            }
        }
    }

    public void removeDoctor(String doctorId) {
        if (doctorId != null) doctors.removeIf(d -> doctorId.equals(d.getDoctorId()));
    }

    public Doctor getDoctorById(String doctorId) {
        if (doctorId == null) return null;
        return doctors.stream()
                .filter(d -> doctorId.equals(d.getDoctorId()))
                .findFirst()
                .orElse(null);
    }

    public List<Doctor> getDoctorsBySpecialization(String specialization) {
        if (specialization == null) return new ArrayList<>();
        return doctors.stream()
                .filter(d -> specialization.equalsIgnoreCase(d.getSpecialization()))
                .collect(Collectors.toList());
    }

    public List<Doctor> getAvailableDoctors() {
        return doctors.stream()
                .filter(d -> !d.getAssignedPatients().isEmpty())
                .collect(Collectors.toList());
    }

    public void displayAllDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors.");
            return;
        }
        doctors.forEach(Doctor::displayInfo);
    }
}