import java.util.Scanner;

public class SumNumbers{

static int calculateSum(int num1, int num2){
	return num1+num2;
}


public static void main(String[] args){
	System.out.println("Enter a number: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum = 0;
	for(int i=1; i<= n; i++){
	
	sum = calculateSum(i,sum);	
} 
System.out.println("The sum of numbers from 1 to "+n+" is:" + sum);

}
}