package q5;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailywage(int hours) {
        return hours * 2000;
    }
}
