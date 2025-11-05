package StudentRecord;

public class Advisor {
    private String name;
    private String office;

    public Advisor(String name, String office) {
        this.name = name;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
    public void advise(Student s){
        System.out.println("Advisor " + name + " is meeting with " + s.getName());
    }
}
