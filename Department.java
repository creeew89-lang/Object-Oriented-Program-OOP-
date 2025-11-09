package Hospital.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {

    private final String departmentId;
    private final String departmentName;
    private String headDoctorId;
    private final List<Doctor> doctors;
    private final List<Nurse> nurses;
    private final int bedCapacity;
    private int availableBeds;

    public Department(String departmentId, String departmentName,
                      String headDoctorId, int bedCapacity) {
        this.departmentId = Objects.requireNonNull(departmentId);
        this.departmentName = Objects.requireNonNull(departmentName);
        this.headDoctorId = headDoctorId;
        this.bedCapacity = bedCapacity;
        this.availableBeds = bedCapacity;
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
    }

    public String getDepartmentId() { return departmentId; }
    public String getDepartmentName() { return departmentName; }
    public String getHeadDoctorId() { return headDoctorId; }
    public void setHeadDoctorId(String headDoctorId) { this.headDoctorId = headDoctorId; }
    public List<Doctor> getDoctors() { return new ArrayList<>(doctors); }
    public List<Nurse> getNurses() { return new ArrayList<>(nurses); }
    public int getBedCapacity() { return bedCapacity; }
    public int getAvailableBeds() { return availableBeds; }

    public void assignDoctor(Doctor doctor) {
        if (doctor != null && !doctors.contains(doctor)) doctors.add(doctor);
    }

    public void assignNurse(Nurse nurse) {
        if (nurse != null && !nurses.contains(nurse)) nurses.add(nurse);
    }

    public void updateBedAvailability(int occupied) {
        availableBeds = Math.max(0, bedCapacity - occupied);
    }

    public void displayInfo() {
        System.out.println("Department ID: " + departmentId);
        System.out.println("Name: " + departmentName);
        System.out.println("Head Doctor ID: " + headDoctorId);
        System.out.println("Doctors: " + doctors.size());
        System.out.println("Nurses: " + nurses.size());
        System.out.println("Beds: " + availableBeds + "/" + bedCapacity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(departmentId, that.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId);
    }
}