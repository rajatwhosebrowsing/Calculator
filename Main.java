import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select task to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sum is: " + cal.addition());
                break;
            case 2:
                System.out.println("Difference is: " + cal.subtraction());
                break;
            case 3:
                System.out.println("Product is: " + cal.multiplication());
                break;
            case 4:
                try {
                    System.out.println("Quotient is: " + cal.division());
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 5:
                System.out.println("Fibonacci result is: " + cal.fibonacciSeries());
                break;
            default:
                System.out.println("Invalid Choice. Please select a valid option.");
        }
        scanner.close();
    }
}
