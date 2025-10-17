package q3;

public class Employee {
    private String employeeId;
    private String name;

    public void setEmployeeId(String id) {
        this.employeeId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() { // ← この行を追加
        return name;
    }
}
