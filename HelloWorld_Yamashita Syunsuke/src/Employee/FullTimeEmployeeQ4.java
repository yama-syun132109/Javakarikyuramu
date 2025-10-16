package Employee;

public class FullTimeEmployeeQ4 extends EmployeeQ4 {

    public FullTimeEmployeeQ4(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hours) {
        return hours * 2000;
    }
}
