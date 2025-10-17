package Q6;

public class Employee implements Billable {
    protected String id;
    public String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int costForDay(int hours) {
        return hours * 1500;
    }

    public String getName() {
        // TODO 自動生成されたメソッド・スタブ
        return name;
    }

    
}
