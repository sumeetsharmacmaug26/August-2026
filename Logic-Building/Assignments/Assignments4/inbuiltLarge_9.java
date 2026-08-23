import java.util.Scanner;
import java.util.Arrays;

public class inbuiltLarge_9{
	public static void main(String[] args){
		System.out.print("Enter 5 integers: ");
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		int large = Arrays.stream(arr).max().getAsInt();
		System.out.println("The largest element is: " + large);
		} 
	
	
	}
	
	
	
