package Q7;

import java.util.List;

public class SalaryReporter {
    private final Printer printer;

    public SalaryReporter(Printer printer) {
        this.printer = printer;
    }

    public void printReport(List<Payable> people) {
        for (Payable p : people) {
            printer.printLine(p.getName() + " の給料は " + p.calculateSalary() + " 円");
        }
    }
}
