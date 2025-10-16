package Employee;

public class ContractEmployeeQ6 extends EmployeeQ6 {

    public ContractEmployeeQ6(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hours) {
        return hours * 1000;
    }
}
