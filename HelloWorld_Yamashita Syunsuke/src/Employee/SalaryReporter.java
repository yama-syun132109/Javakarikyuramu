package Employee;

import java.util.List;

public class SalaryReporter {
    private final PrinterQ7 printer;

    public SalaryReporter(PrinterQ7 printer) {
        this.printer = printer;
    }

    public void printReport(List<PayableQ7> people) {
        for (PayableQ7 p : people) {
            printer.printLine(p.getName() + " の給料は " + p.calculateSalary() + " 円");
        }
    }
}
