package fig3;

public class Designer implements Employee {
    private final String name;

    public Designer(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("[Designer] " + name + " is designing UI/UX.");
    }

    @Override
    public String getRole() {
        return "Designer";
    }

    @Override
    public String toString() {
        return getRole() + "(" + name + ")";
    }
}
