import java.util.Scanner;

public class Sum {

	static int sumOfTwoNumbers(int num1, int num2){return num1 + num2;}	


	public static void main(String[] args)
{ 	
	System.out.println("Enter first number:");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	System.out.println("Give second number:");
	int num2 = sc.nextInt();
	System.out.println("The sum of 15 and 25 is "+ sumOfTwoNumbers(num1, num2));
}

}