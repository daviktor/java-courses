
public class Calculate {

    public static void main(String[] args) {

        System.out.println("Calculate.");
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);

        System.out.printf("Arithmetic on numbers %.2f and %.2f\n\n", a, b);

        Calculate calculate = new Calculate();

        calculate.sum(a, b);
        calculate.subtraction(a, b);
        calculate.division(a, b);
        calculate.product(a, b);
        calculate.involution(a, b);

    }

    public void sum(double a, double b) {

        System.out.printf("Sum %.2f + %.2f = %.2f\n", a, b, a + b);
    }

    public void subtraction(double a, double b) {

        System.out.printf("Subtraction %.2f - %.2f = %.2f\n", a, b, a - b);
    }

    public void division(double a, double b) {

        if (b != 0) {
            System.out.printf("Division %.2f / %.2f = %.2f\n", a, b, a / b);
        } else {
            System.out.printf("Division %.2f / %.2f = You can not divide by zero!\n", a, b);
        }
    }

    public void product(double a, double b) {

        System.out.printf("Product %.2f * %.2f = %.2f\n", a, b, a * b);

    }

    public void involution(double a, double b) {

        double c = a;
        for (int i = 1; i < b; i++) {

            c *= a;
        }
        System.out.printf("Involution %.2f ^ %.2f = %.2f\n",a,b,c);

    }
}
