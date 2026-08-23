import java.util.Scanner;

public class PrintNumber1{
public staic void main(String[] args){
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	for(int i=1; i<=N; i++){
		System.out.print(i + " ");
}
}
}