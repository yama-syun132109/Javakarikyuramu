package main2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Employee.BillableQ6;
import Employee.ConsolePrinterQ7;
import Employee.ContractEmployeeQ5;
import Employee.ContractEmployeeQ6;
import Employee.ContractEmployeeQ7;
import Employee.EmployeeQ1;
import Employee.EmployeeQ2;
import Employee.EmployeeQ3;
import Employee.EmployeeQ4;
import Employee.EmployeeQ5;
import Employee.EmployeeQ6;
import Employee.FullTimeEmployeeQ4;
import Employee.FullTimeEmployeeQ5;
import Employee.FullTimeEmployeeQ6;
import Employee.FullTimeEmployeeQ7;
import Employee.PartTimeEmployeeQ4;
import Employee.PayableQ7;
import Employee.SalaryReporter;

public class Main2 {
    public static void main(String[] args) {
        // Q1
        EmployeeQ1 emp1 = new EmployeeQ1();
        emp1.name = "山田太郎";
        emp1.work();

        // Q2
        EmployeeQ2 emp2 = new EmployeeQ2();
        emp2.employeeId = "E001";
        emp2.name = "佐藤太郎";
        emp2.showInfo();

        // Q3
        EmployeeQ3 emp3 = new EmployeeQ3();
        emp3.setEmployeeId("E002");
        emp3.setName("田中花子");
        System.out.println("社員ID: " + emp3.getEmployeeId() + ", 名前: " + emp3.getName());

        // Q4
        EmployeeQ4 full = new FullTimeEmployeeQ4("F001", "正社員A");
        EmployeeQ4 part = new PartTimeEmployeeQ4("P001", "パートB");
        System.out.println("正社員の給与: " + full.calculateDailyWage(9) + " 円");
        System.out.println("パート社員の給与: " + part.calculateDailyWage(9) + " 円");

        // Q5
        List<EmployeeQ5> employeesQ5 = new ArrayList<>();
        employeesQ5.add(new FullTimeEmployeeQ5("F001", "佐々木"));
        employeesQ5.add(new ContractEmployeeQ5("C001", "山本"));
        employeesQ5.add(new FullTimeEmployeeQ5("F002", "田中"));
        employeesQ5.add(new ContractEmployeeQ5("C002", "鈴木"));

        for (EmployeeQ5 e : employeesQ5) {
            System.out.println(e.getName() + "の日給: " + e.calculateDailywage(9) + " 円");
        }

        // Q6
        List<EmployeeQ6> membersQ6 = new ArrayList<>();
        membersQ6.add(new FullTimeEmployeeQ6("F001", "青木"));
        membersQ6.add(new ContractEmployeeQ6("C001", "上田"));
        membersQ6.add(new FullTimeEmployeeQ6("F002", "小林"));

        for (BillableQ6 b : membersQ6) {
            System.out.println(((EmployeeQ6) b).name + "の日給: " + b.costForDay(9) + " 円");
        }

        // Q7
        List<PayableQ7> peopleQ7 = Arrays.asList(
                new FullTimeEmployeeQ7("高橋", 9),
                new ContractEmployeeQ7("伊藤", 9)
        );
        SalaryReporter reporter = new SalaryReporter(new ConsolePrinterQ7());
        reporter.printReport(peopleQ7);
    }
}
