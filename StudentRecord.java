package StudentRecord;

public class StudentRecord {
    private String name;
    private int id;
    private double gpa;

    public StudentRecord(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Students: " + name + " | ID: " + id + " | GPA: " + gpa);
    }
}
