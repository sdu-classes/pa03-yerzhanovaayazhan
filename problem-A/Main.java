import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // integer values
        try {
            System.out.println("Please enter two numbers: ");
            int a = in.nextInt();
            int b = in.nextInt();
            Calculator c = new Calculator(a, b);
            
            int result = c.add();
            System.out.println("Addition: " + result);

            result = c.sub();
            System.out.println("Subtraction: " + result);

            result = c.mul();
            System.out.println("Multiplication: " + result);

            result = c.div();
            System.out.println("Division: " + result);
        
        } catch (ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }

        // non-integer values
        try {
            Calculator c2 = new Calculator(2, 4);
            System.out.println(c2.add());
        } catch (NumberFormatException exc) {
            System.out.println(exc.getMessage());
        }


    }
}
