class Calculator {
    int addition() {
        int[] num;
        UserInput u1 = new UserInput();
        num = u1.userInput();
        int sum = num[0] + num[1];
        return sum;
    }

    int subtraction() {
        int[] num;
        UserInput u1 = new UserInput();
        num = u1.userInput();
        int difference = num[0] - num[1];
        return difference;
    }

    int multiplication() {
        int[] num;
        UserInput u1 = new UserInput();
        num = u1.userInput();
        int product = num[0] * num[1];
        return product;
    }

    int division() {
        int[] num;
        UserInput u1 = new UserInput();
        num = u1.userInput();
        if (num[1] == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num[0] / num[1];
    }

    String fibonacciSeries() {
    UserInput u1 = new UserInput();
    System.out.println("Enter the number of terms for Fibonacci series:");
    int n = u1.singleInput();
    StringBuilder series = new StringBuilder();

    int a = 0, b = 1; // First two terms
    series.append(a);
    if (n > 1) {
        series.append(", ").append(b);
    }

    for (int i = 2; i < n; i++) {
        int next = a + b;
        series.append(", ").append(next);
        a = b;
        b = next;
    }

    return series.toString();
	}

}










