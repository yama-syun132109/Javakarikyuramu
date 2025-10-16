package Employee;

public class FullTimeEmployeeQ5 extends EmployeeQ5 {

    public FullTimeEmployeeQ5(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailywage(int hours) {
        return hours * 2000;
    }
}
