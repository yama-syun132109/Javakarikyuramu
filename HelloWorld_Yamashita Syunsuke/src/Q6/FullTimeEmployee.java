package Q6;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hours) {
        return hours * 2000;
    }
}
