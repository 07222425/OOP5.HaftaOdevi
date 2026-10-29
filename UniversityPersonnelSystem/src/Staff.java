public class Staff extends Employee {
    private String title;

    public Staff() {
    }

    public Staff(String name, String office, double salary, MyDate dateHired, String title) {
        super(name, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + getName();
    }
}