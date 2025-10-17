package Q7;

public class ContractEmployee implements Payable {
    private String name;
    private int hours;

    public ContractEmployee(String name, int hours) {
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
