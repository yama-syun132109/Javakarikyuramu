package Employee;

public class ContractEmployeeQ7 implements PayableQ7 {
    private String name;
    private int hours;

    public ContractEmployeeQ7(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int calculateSalary() {
        return hours * 1200;
    }
}
