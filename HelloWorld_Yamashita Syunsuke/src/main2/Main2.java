package main2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        // ----- Q1 -----
        Q1.Employee emp1 = new Q1.Employee();
        emp1.name = "山田太郎";
        emp1.work();

        // ----- Q2 -----
        Q2.Employee emp2 = new Q2.Employee();
        emp2.employeeId = "E001";
        emp2.name = "佐藤太郎";
        emp2.showInfo();

        // ----- Q3 -----
        Q3.Employee emp3 = new Q3.Employee();
        emp3.setEmployeeId("E002");
        emp3.setName("田中花子");
        System.out.println("社員ID: " + emp3.getEmployeeId() + ", 名前: " + emp3.getName());

        // ----- Q4 -----
        Q4.Employee full = new Q4.FullTimeEmployee("F001", "正社員A");
        Q4.Employee part = new Q4.PartTimeEmployee("P001", "パートB");

        System.out.println("正社員の給与: " + full.calculateDailyWage(9) + " 円");
        System.out.println("パート社員の給与: " + part.calculateDailyWage(9) + " 円");

        // ----- Q5 -----
        List<Q5.Employee> employees5 = new ArrayList<>();
        employees5.add(new Q5.FullTimeEmployee("F001", "佐々木"));
        employees5.add(new Q5.ContractEmployee("C001", "山本"));
        employees5.add(new Q5.FullTimeEmployee("F002", "田中"));
        employees5.add(new Q5.ContractEmployee("C002", "鈴木"));

        int hours5 = 9;
        for (Q5.Employee e : employees5) {
            int pay = e.calculateDailywage(hours5);
            System.out.println(e.getName() + "の日給: " + pay + " 円");
        }

        // ----- Q6 -----
        List<Q6.Employee> employees6 = new ArrayList<>();
        employees6.add(new Q6.FullTimeEmployee("F001", "青木"));
        employees6.add(new Q6.ContractEmployee("C001", "上田"));
        employees6.add(new Q6.FullTimeEmployee("F002", "小林"));

        int hours6 = 9;
        for (Q6.Employee e : employees6) {
            Q6.Billable b = (Q6.Billable) e;
            System.out.println(e.getName() + "の日給: " + b.costForDay(hours6) + " 円");
        }

        // ----- Q7 -----
        List<Q7.Payable> payables = Arrays.asList(
            new Q7.FullTimeEmployee("高橋", 9),
            new Q7.ContractEmployee("伊藤", 9)
        );

        Q7.SalaryReporter reporter = new Q7.SalaryReporter(new Q7.ConsolePrinter());
        reporter.printReport(payables);
    }
}
