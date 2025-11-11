package fig2;

public class Robot implements Driver {
    private final String id;

    public Robot(String id) {
        this.id = id;
    }

    @Override
    public void navigate(String destination) {
        System.out.println("[Robot] " + id + " calculating route to " + destination);
    }

    @Override
    public String toString() {
        return "Robot(" + id + ")";
    }
}
