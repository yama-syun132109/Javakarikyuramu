package main2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        // cxkzx---w1aw2w2e-- Q1 -----
        q1.Employee emp1 = new q1.Employee();
        emp1.name = "山田太郎";
        emp1.work();

        // ----- Q2 -----
        q2.Employee emp2 = new q2.Employee();
        emp2.employeeId = "E001";
        emp2.name = "佐藤太郎";
        emp2.showInfo();

        // ----- Q3 -----
        q3.Employee emp3 = new q3.Employee();
        emp3.setEmployeeId("E002");
        emp3.setName("田中花子");
        System.out.println("社員ID: " + emp3.getEmployeeId() + ", 名前: " + emp3.getName());

        // ----- Q4 -----
        q4.Employee full = new q4.FullTimeEmployee("F001", "正社員A");
        q4.Employee part = new q4.PartTimeEmployee("P001", "パートB");

        System.out.println("正社員の給与: " + full.calculateDailyWage(9) + " 円");
        System.out.println("パート社員の給与: " + part.calculateDailyWage(9) + " 円");

        // ----- Q5 -----
        List<q5.Employee> employees5 = new ArrayList<>();
        employees5.add(new q5.FullTimeEmployee("F001", "佐々木"));
        employees5.add(new q5.ContractEmployee("C001", "山本"));
        employees5.add(new q5.FullTimeEmployee("F002", "田中"));
        employees5.add(new q5.ContractEmployee("C002", "鈴木"));

        int hours5 = 9;
        for (q5.Employee e : employees5) {
            int pay = e.calculateDailywage(hours5);
            System.out.println(e.getName() + "の日給: " + pay + " 円");
        }

        // ----- Q6 -----
        List<q6.Employee> employees6 = new ArrayList<>();
        employees6.add(new q6.FullTimeEmployee("F001", "青木"));
        employees6.add(new q6.ContractEmployee("C001", "上田"));
        employees6.add(new q6.FullTimeEmployee("F002", "小林"));

        int hours6 = 9;
        for (q6.Employee e : employees6) {
            q6.Billable b = (q6.Billable) e;
            System.out.println(e.getName() + "の日給: " + b.costForDay(hours6) + " 円");
        }

        // ----- Q7 -----
        List<q7.Payable> payables = Arrays.asList(
            new q7.FullTimeEmployee("高橋", 9),
            new q7.ContractEmployee("伊藤", 9)
        );

        q7.SalaryReporter reporter = new q7.SalaryReporter(new q7.ConsolePrinter());
        reporter.printReport(payables);
    }
}
