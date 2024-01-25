import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = calculate(num1, num2, operator);

        if (Double.isNaN(result)) {
            System.out.println("Error: Invalid input or division by zero.");
        } else {
            System.out.println("Result: " + result);
        }
    }

    private static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (num2 != 0) ? num1 / num2 : Double.NaN;
            default:
                return Double.NaN;
        }
    }
}