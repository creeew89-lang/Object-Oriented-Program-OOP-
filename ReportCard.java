package StudentRecord;

public class ReportCard {
    private Student student;

    public ReportCard(Student student) {
        this.student = student;
    }

    public void display() {
        System.out.println("Report Card for " + student.getName());
        System.out.println("GPA: " + student.getGpa());
        System.out.println("Performance: " + (student.getGpa() >= 3.5 ? "Excellent" : "Needs Improvement"));
    }
}