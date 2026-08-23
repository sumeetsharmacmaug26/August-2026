import java.util.Scanner;

public class Even_4{
	public static void main(String[] args){
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println();
		for(int i = 1; i<=N; i++){
					if(i%2 == 0) System.out.print(i + " ");
		
	}
	}
}