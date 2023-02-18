public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public Calculator(Object a, Object b) {
        /*
         * Razminka: 
         * 2 3 +
         * 2 3.4 +
         * 2.3f 3.4 +
         * "3.14" "4" +
         */
        throw new NumberFormatException("Non-integer value entered.");
    }

    public int add() {
        if (a < 0 || b < 0) {
            throw new ArithmeticException(String.format("One of the numbers is negative (%d, %d).", this.a, this.b));
        }
        return this.a + this.b;
    }

    public int sub() {
        if (a < 0 || b < 0) {
            throw new ArithmeticException(String.format("One of the numbers is negative (%d, %d).", this.a, this.b));
        }
        return this.a - this.b;
    }

    public int mul() {
        if (a == 0 || b == 0) {
            throw new ArithmeticException(String.format("One of the numbers is zero (%d, %d).", this.a, this.b));
        }
        return this.a * this.b;
    }

    public int div() {
        if (a == 0 || b == 0) {
            throw new ArithmeticException(String.format("One of the numbers is zero (%d, %d).", this.a, this.b));
        }
        return this.a / this.b;
    }
}
