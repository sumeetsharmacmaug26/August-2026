import java.util.Scanner;

public class Factorial_3{
	
	public static void main(String[] args){
		System.out.print("Enter a number: ");
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int factorial = 1;
		for(int i = 1; i<= N; i++){
			factorial = factorial * i;
	
	
		} System.out.println("Factorial of " + N + " is " + factorial);
	}
}