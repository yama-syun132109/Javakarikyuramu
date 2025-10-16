package Employee;

public abstract class EmployeeQ4 {
    protected String id;
    protected String name;

    public EmployeeQ4(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract int calculateDailyWage(int hours);
}
