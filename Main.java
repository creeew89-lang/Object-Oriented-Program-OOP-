package StudentRecord;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Lina", 1001, 3.8);
        ReportCard rc = new ReportCard(s1);
        rc.display();
    }
}
