package StudentRecord;

public class Enrollment {
    private Student student;
    private Course course;
    private String grade;

    public Enrollment(String student, Course course, String grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void display(){
        System.out.println(student.getName() + " enrolled in " + course.getTitle());
    }
}
