package fig3;

import java.util.List;

public class OutsourcingCompany extends Company {
    @Override
    protected List<Employee> createEmployees() {
        return java.util.Arrays.asList(
            new Programmer("Rana"),
            new Programmer("Adeel"),
            new Tester("Nida"));
    }
}
