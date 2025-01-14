import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    System.out.println("Welcome to the Calculator App!");
    boolean continueCalculation = true;

    while (continueCalculation) {
      System.out.println("\nChoose an operation:");
      System.out.println("1. Addition (+)");
      System.out.println("2. Subtraction (-)");
      System.out.println("3. Multiplication (*)");
      System.out.println("4. Division (/)");
      System.out.println("5. Modulus (%)");
      System.out.println("6. Factorial (!)");
      System.out.println("7. Exponent (^)");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();
      double num1, num2;

      if (choice == 1) {
        System.out.print("Enter two numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.add(num1, num2));
      } else if (choice == 2) {
        System.out.print("Enter two numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.subtract(num1, num2));
      } else if (choice == 3) {
        System.out.print("Enter two numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.multiply(num1, num2));
      } else if (choice == 4) {
        System.out.print("Enter two numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.divide(num1, num2));
      } else if (choice == 5) {
        System.out.print("Enter two numbers: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.modulus(num1, num2));
      } else if (choice == 6) {
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        System.out.println("Result: " + calculator.factorial(n));
      } else if (choice == 7) {
        System.out.print("Enter the base and exponent: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Result: " + calculator.exponent(num1, num2));
      } else {
        System.out.println("Invalid choice. Please try again.");
      }

      System.out.print("\nDo you want to perform another calculation? (y/n): ");
      String continueResponse = scanner.next();
      if (continueResponse.equals("n")) {
        continueCalculation = false;
      } else {
        continueCalculation = true;
      }
    }

    System.out.println("Thank you for using the Calculator App!");

  }
}
