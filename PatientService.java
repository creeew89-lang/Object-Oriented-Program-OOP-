package Hospital.Services;

import Hospital.Models.Patient;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PatientService {

    private static final PatientService INSTANCE = new PatientService();
    private final List<Patient> patients = new ArrayList<>();

    public static PatientService getInstance() { return INSTANCE; }
    private PatientService() {}

    public void addPatient(Patient patient) {
        if (patient != null) patients.add(patient);
    }

    public void editPatient(String patientId, Patient updated) {
        if (patientId == null || updated == null) return;
        for (int i = 0; i < patients.size(); i++) {
            if (patientId.equals(patients.get(i).getPatientId())) {
                patients.set(i, updated);
                return;
            }
        }
    }

    public void removePatient(String patientId) {
        if (patientId != null) patients.removeIf(p -> patientId.equals(p.getPatientId()));
    }

    public Patient getPatientById(String patientId) {
        if (patientId == null) return null;
        return patients.stream()
                .filter(p -> patientId.equals(p.getPatientId()))
                .findFirst()
                .orElse(null);
    }

    public List<Patient> searchPatientsByName(String name) {
        if (name == null) return new ArrayList<>();
        return patients.stream()
                .filter(p -> p.getFirstName().toLowerCase().contains(name.toLowerCase())
                        || p.getLastName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients.");
            return;
        }
        patients.forEach(Patient::displayInfo);
    }
}