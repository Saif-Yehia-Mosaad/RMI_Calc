import java.rmi.Naming;

public class Calc {

    public static void main(String[] args) {

        try {


            int x = Integer.parseInt(args[0]);
            String op = args[1];
            int y = Integer.parseInt(args[2]);

            Calculator calc =
                (Calculator) Naming.lookup("rmi://localhost:2000/CalcService");




            double result ;

            switch (op) {
                case "+":
                    result = calc.add(x, y);
                    break;
                case "-":
                    result = calc.subtract(x, y);
                    break;
                case "*":
                    result = calc.multiply(x, y);
                    break;
                case "/":
                    result = calc.divide(x, y);
                    break;
                default:
                    System.out.println("Invalid Operation");
                    return;
            }

            System.out.println("Result = " + result);
        }
        catch (Exception e) {
            System.out.println("Client Error: " + e);
        }
    }
}
