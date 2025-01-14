public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        return a / b;
    }

    // Modulus
    public double modulus(double a, double b) {
        return a % b;
    }

    // Factorial
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Exponentiation
    public double exponent(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
