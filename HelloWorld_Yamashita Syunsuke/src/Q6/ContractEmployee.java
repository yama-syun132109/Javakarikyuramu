package Q6;

public class ContractEmployee extends Employee {

    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hours) {
        return hours * 1000;
    }
}
