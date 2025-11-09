package Hospital.Services;

import Hospital.Models.Department;
import Hospital.Models.Doctor;
import Hospital.Models.Nurse;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private static final DepartmentService INSTANCE = new DepartmentService();
    private final List<Department> departments = new ArrayList<>();

    public static DepartmentService getInstance() {
        return INSTANCE;
    }

    private DepartmentService() {
    }

    public void addDepartment(Department department) {
        if (department != null) departments.add(department);
    }

    public void editDepartment(String departmentId, Department updated) {
        if (departmentId == null || updated == null) return;
        for (int i = 0; i < departments.size(); i++) {
            if (departmentId.equals(departments.get(i).getDepartmentId())) {
                departments.set(i, updated);
                return;
            }
        }
    }

    public void removeDepartment(String departmentId) {
        if (departmentId != null) departments.removeIf(d -> departmentId.equals(d.getDepartmentId()));
    }

    public Department getDepartmentById(String departmentId) {
        if (departmentId == null) return null;
        return departments.stream().filter(d -> departmentId.equals(d.getDepartmentId())).findFirst().orElse(null);
    }

    public void assignDoctorToDepartment(String doctorId, String departmentId) {
        Department dept = getDepartmentById(departmentId);
        if (dept == null) return;
        Doctor doc = DoctorService.getInstance().getDoctorById(doctorId);
        if (doc != null) dept.assignDoctor(doc);
    }

    public void assignNurseToDepartment(String nurseId, String departmentId) {
        Department dept = getDepartmentById(departmentId);
        if (dept == null) return;
        Nurse nurse = NurseService.getInstance().getNurseById(nurseId);
        if (nurse != null) dept.assignNurse(nurse);
    }

    public void displayAllDepartments() {
        if (departments.isEmpty()) {
            System.out.println("No departments.");
            return;
        }
        departments.forEach(Department::displayInfo);
    }

    public void displayDepartmentStatistics() {
        departments.forEach(d -> System.out.println(d.getDepartmentName() + " - Doctors: " + d.getDoctors().size() + ", Nurses: " + d.getNurses().size() + ", Beds: " + d.getAvailableBeds() + "/" + d.getBedCapacity()));
    }
}