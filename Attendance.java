package StudentRecord;

public class Attendance {
    private Student student;
    private Course course;
    private boolean present;

    public Attendance(Student student, Course course, boolean present) {
        this.student = student;
        this.course = course;
        this.present = present;
    }
    public void display(){
        String status = present ? "Present" : "Absent";
        System.out.println(Student.getName() + " Was " + status + " in  " + course.getTitle());
    }
}
