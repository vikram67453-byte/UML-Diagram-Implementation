package fig2;

public class CombustionEngine implements Engine {
    @Override
    public void move() {
        System.out.println("[CombustionEngine] Burning fuel to move..."); 
    }

    @Override
    public String toString() {
        return "CombustionEngine";
    }
}
