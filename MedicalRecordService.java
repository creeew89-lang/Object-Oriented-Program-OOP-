package Hospital.Services;

import Hospital.Models.MedicalRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MedicalRecordService {

    private final List<MedicalRecord> records = new ArrayList<>();

    public void addRecord(MedicalRecord record) {
        if (record != null) records.add(record);
    }

    public void editRecord(String recordId, MedicalRecord updated) {
        if (recordId == null || updated == null) return;
        for (int i = 0; i < records.size(); i++) {
            if (recordId.equals(records.get(i).getRecordId())) {
                records.set(i, updated);
                return;
            }
        }
    }

    public void removeRecord(String recordId) {
        if (recordId != null) records.removeIf(r -> recordId.equals(r.getRecordId()));
    }

    public MedicalRecord getRecordById(String recordId) {
        if (recordId == null) return null;
        return records.stream()
                .filter(r -> recordId.equals(r.getRecordId()))
                .findFirst()
                .orElse(null);
    }

    public List<MedicalRecord> getRecordsByPatientId(String patientId) {
        if (patientId == null) return new ArrayList<>();
        return records.stream()
                .filter(r -> patientId.equals(r.getPatientId()))
                .collect(Collectors.toList());
    }

    public List<MedicalRecord> getRecordsByDoctorId(String doctorId) {
        if (doctorId == null) return new ArrayList<>();
        return records.stream()
                .filter(r -> doctorId.equals(r.getDoctorId()))
                .collect(Collectors.toList());
    }

    public void displayPatientHistory(String patientId) {
        List<MedicalRecord> history = getRecordsByPatientId(patientId);
        if (history.isEmpty()) {
            System.out.println("No history for patient " + patientId);
            return;
        }
        history.forEach(MedicalRecord::displayInfo);
    }

    public void displayAllRecords() {
        if (records.isEmpty()) {
            System.out.println("No medical records.");
            return;
        }
        records.forEach(MedicalRecord::displayInfo);
    }
}