package Employee;

public class ContractEmployeeQ5 extends EmployeeQ5 {

    public ContractEmployeeQ5(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailywage(int hours) {
        return hours * 1200;
    }
}
