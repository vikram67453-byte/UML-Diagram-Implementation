package fig3;

public class MainFig3 {
    public static void main(String[] args) {
        System.out.println("--- Fig3 Demo: Company creates Employees via factory method ---");
        Company gameDev = new GameDevCompany();
        System.out.println("GameDevCompany employees:"); 
        gameDev.getEmployees();

        System.out.println();

        Company outsourcing = new OutsourcingCompany();
        System.out.println("OutsourcingCompany employees:"); 
        outsourcing.getEmployees();
    }
}
