package fig3;

import java.util.List;

public abstract class Company {
    public List<Employee> getEmployees() {
        var employees = createEmployees();
        for (Employee e : employees) {
            e.doWork();
        }
        return employees;
    }

    protected abstract java.util.List<Employee> createEmployees();
}
