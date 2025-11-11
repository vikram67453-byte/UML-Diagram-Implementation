package fig3;

import java.util.List;

public class GameDevCompany extends Company {
    @Override
    protected List<Employee> createEmployees() {
        return java.util.Arrays.asList(
            new Designer("Mona"),
            new Programmer("Lee"),
            new Tester("Sam"));
    }
}
