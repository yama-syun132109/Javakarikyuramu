package Employee;

public abstract class EmployeeQ5 {
    protected String id;
    protected String name;

    public EmployeeQ5(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int calculateDailywage(int hours);
}
