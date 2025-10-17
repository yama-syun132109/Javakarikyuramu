package Q5;

public class ContractEmployee extends Employee {

    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailywage(int hours) {
        return hours * 1200;
    }
}
