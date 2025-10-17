package Q7;

public class FullTimeEmployee implements Payable {
    private String name;
    private int hours;

    public FullTimeEmployee(String name, int hours) {
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
