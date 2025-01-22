import java.util.Scanner;

class UserInput {
    int[] userInput() {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[2];
        System.out.println("Enter the first number:");
        num[0] = scanner.nextInt();
        System.out.println("Enter the second number:");
        num[1] = scanner.nextInt();
        return num;
    }

    int singleInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        return scanner.nextInt();
    }
}
