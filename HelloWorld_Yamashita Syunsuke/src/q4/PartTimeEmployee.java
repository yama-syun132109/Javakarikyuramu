package q4;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hours) {
        return hours * 1000;
    }
}
