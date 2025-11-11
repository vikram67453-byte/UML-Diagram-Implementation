package fig2;

public class Transport {
    private final Engine engine;
    private final Driver driver;

    public Transport(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public void deliver(String destination, String cargo) {
        System.out.println("[Transport] Preparing to deliver: " + cargo + " to " + destination);
        engine.move();
        driver.navigate(destination);
        System.out.println("[Transport] Delivered " + cargo + " to " + destination + "\n");
    }
}
