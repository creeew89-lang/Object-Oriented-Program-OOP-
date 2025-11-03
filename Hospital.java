package Hospital.Models;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String hospitalID;
    private String hospitalName;
    private String location;
    private List<Department> departments = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Nurse> nurses = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String hospitalID, String hospitalName, String location) {
        this.hospitalID = hospitalID;
        this.hospitalName = hospitalName;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Hospital ID  : " + hospitalID);
        System.out.println("Name         : " + hospitalName);
        System.out.println("Location     : " + location);
        System.out.println("Departments  : " + departments.size());
        System.out.println("Doctors      : " + doctors.size());
        System.out.println("Nurses       : " + nurses.size());
        System.out.println("Patients     : " + patients.size());
    }

    public void addDepartment(Department d) {
        if (d != null && !departments.contains(d)) departments.add(d);
    }

    public void registerPatient(Patient p) {
        if (p != null && !patients.contains(p)) patients.add(p);
    }

    public void hireDoctor(Doctor d) {
        if (d != null && !doctors.contains(d)) doctors.add(d);
    }

    public void hireNurse(Nurse n) {
        if (n != null && !nurses.contains(n)) nurses.add(n);
    }

    public String getHospitalID() { return hospitalID; }
    public String getHospitalName() { return hospitalName; }
    public String getLocation() { return location; }

    public void setHospitalID(String id) { this.hospitalID = id; }
    public void setHospitalName(String name) { this.hospitalName = name; }
    public void setLocation(String loc) { this.location = loc; }

    public List<Department> getDepartments() { return departments; }
    public List<Doctor> getDoctors() { return doctors; }
    public List<Nurse> getNurses() { return nurses; }
    public List<Patient> getPatients() { return patients; }

    public void setDepartments(List<Department> departments) { this.departments = departments; }
    public void setDoctors(List<Doctor> doctors) { this.doctors = doctors; }
    public void setNurses(List<Nurse> nurses) { this.nurses = nurses; }
    public void setPatients(List<Patient> patients) { this.patients = patients; }
}