package Employee;

public class FullTimeEmployeeQ7 implements PayableQ7 {
    private String name;
    private int hours;

    public FullTimeEmployeeQ7(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int calculateSalary() {
        return hours * 2000;
    }
}
