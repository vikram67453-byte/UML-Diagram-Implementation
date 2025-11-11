package fig2;

public class MainFig2 {
    public static void main(String[] args) {
        System.out.println("--- Fig2 Demo: Composition (Engine + Driver) ---");
        Engine e = new CombustionEngine();
        Driver h = new Human("Alice");
        Transport truck = new Transport(e, h);
        truck.deliver("City Center", "Tools");

        Engine e2 = new ElectricEngine();
        Driver r = new Robot("R2-D2");
        Transport drone = new Transport(e2, r);
        drone.deliver("Warehouse B", "Spare Parts");
    }
}
