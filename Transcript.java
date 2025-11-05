package StudentRecord;

public class Transcript {
    private String student;

    public Transcript(String student) {
        this.student = student;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void display() {
        System.out.println("Transcript for: " + student.getName());
        System.out.println("GPA: " + student.getGpa());

    }
}
