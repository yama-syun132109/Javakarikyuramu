package Employee;

public class EmployeeQ6 implements BillableQ6 {
    protected String id;
    public String name;

    public EmployeeQ6(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int costForDay(int hours) {
        return hours * 1500;
    }
}
