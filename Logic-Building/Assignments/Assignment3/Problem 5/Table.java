import java.util.Scanner;

public class Table{

static int printMultiplicationTable(int num1, int num2){
	return(num1 * num2);
}


public static void main(String[] args){
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	for(int i = 1; i<=10; i++){
	System.out.println(num1 + " x " + i + " = " +printMultiplicationTable(num1, i) );
}
}
}