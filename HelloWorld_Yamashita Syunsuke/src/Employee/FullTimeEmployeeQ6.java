package Employee;

public class FullTimeEmployeeQ6 extends EmployeeQ6 {

    public FullTimeEmployeeQ6(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hours) {
        return hours * 2000;
    }
}
