package Employee;

public class PartTimeEmployeeQ4 extends EmployeeQ4 {

    public PartTimeEmployeeQ4(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hours) {
        return hours * 1000;
    }
}
