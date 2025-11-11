package fig2;

public class Human implements Driver {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void navigate(String destination) {
        System.out.println("[Human] " + name + " navigating to " + destination);
    }

    @Override
    public String toString() {
        return "Human(" + name + ")";
    }
}
