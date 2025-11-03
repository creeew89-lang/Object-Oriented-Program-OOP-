package Hospital.Services;

import Hospital.Models.Nurse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NurseService {

    private static final NurseService INSTANCE = new NurseService();
    private final List<Nurse> nurses = new ArrayList<>();

    public static NurseService getInstance() { return INSTANCE; }
    private NurseService() {}

    public void addNurse(Nurse nurse) {
        if (nurse != null) nurses.add(nurse);
    }

    public void editNurse(String nurseId, Nurse updated) {
        if (nurseId == null || updated == null) return;
        for (int i = 0; i < nurses.size(); i++) {
            if (nurseId.equals(nurses.get(i).getNurseId())) {
                nurses.set(i, updated);
                return;
            }
        }
    }

    public void removeNurse(String nurseId) {
        if (nurseId != null) nurses.removeIf(n -> nurseId.equals(n.getNurseId()));
    }

    public Nurse getNurseById(String nurseId) {
        if (nurseId == null) return null;
        return nurses.stream()
                .filter(n -> nurseId.equals(n.getNurseId()))
                .findFirst()
                .orElse(null);
    }

    public List<Nurse> getNursesByDepartment(String departmentId) {
        if (departmentId == null) return new ArrayList<>();
        return nurses.stream()
                .filter(n -> departmentId.equalsIgnoreCase(n.getDepartmentId()))
                .collect(Collectors.toList());
    }

    public List<Nurse> getNursesByShift(String shift) {
        if (shift == null) return new ArrayList<>();
        return nurses.stream()
                .filter(n -> shift.equalsIgnoreCase(n.getShift()))
                .collect(Collectors.toList());
    }

    public void displayAllNurses() {
        if (nurses.isEmpty()) {
            System.out.println("No nurses.");
            return;
        }
        nurses.forEach(Nurse::displayInfo);
    }
}