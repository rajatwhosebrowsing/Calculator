//Main.java
import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Calculator cal=new Calculator();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Select task to perform");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
	
		int choice=scanner.nextInt();
		switch (choice){
			case 1:
				System.out.println("Sum is :"+cal.addition());
				break;
			case 2:
				System.out.println("Difference is :"+cal.substraction());
				break;
			case 3:
				System.out.println("Product is :"+cal.multiplication());
				break;
			case 4:
				try{
					System.out.println("Quotient is :"+cal.division());
				}catch(ArithmeticException e){
						System.out.println("Error :Divison by zero is not possible.");
				}
				break;
			default:
				System.out.println("Invalid Choice.Please select a valid question.");
			}
			scanner.close();
		}
}