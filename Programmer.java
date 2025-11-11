package fig3;

public class Programmer implements Employee {
    private final String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("[Programmer] " + name + " is writing code.");
    }

    @Override
    public String getRole() {
        return "Programmer";
    }

    @Override
    public String toString() {
        return getRole() + "(" + name + ")";
    }
}
