import java.rmi.Naming;

public class CalculatorServer {

    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
        try {
            CalculatorImpl calc = new CalculatorImpl();

            // Naming.rebind("CalcService", calc);
            Naming.rebind("rmi://localhost:2000/CalcService", calc);

            System.out.println("Calculator Server is Ready...");
        }
        catch (Exception e) {
            System.out.println("Server Error: " + e);

        }
    }
}
