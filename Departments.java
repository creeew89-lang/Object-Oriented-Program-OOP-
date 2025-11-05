package StudentRecord;

import java.util.ArrayList;

public class Departments {
    private String name;
    private ArrayList <Course> courses = new ArrayList<>();

    public Departments(String name) {
        this.name = name;
    }
    public void addCourses(Course c){
        courses.add(c);
    }
    public void displayCourses(){
        System.out.println("Department: " + name);
        for (Course c : courses) c.display();
    }
}
