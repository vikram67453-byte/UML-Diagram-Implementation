package fig2;

public class ElectricEngine implements Engine {
    @Override
    public void move() {
        System.out.println("[ElectricEngine] Using electric power to move..."); 
    }

    @Override
    public String toString() {
        return "ElectricEngine";
    }
}
