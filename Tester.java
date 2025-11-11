package fig3;

public class Tester implements Employee {
    private final String name;

    public Tester(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("[Tester] " + name + " is testing the product.");
    }

    @Override
    public String getRole() {
        return "Tester";
    }

    @Override
    public String toString() {
        return getRole() + "(" + name + ")";
    }
}
