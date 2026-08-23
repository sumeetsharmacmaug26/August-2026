import java.util.Scanner;

public class LargestElement_9{
	public static void main(String[] args){
		System.out.print("Enter 5 integers: ");
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		int large = 0;
		for(int i = 0; i< arr.length; i++){
			if (arr[i] > large) {large = arr[i];}
		} System.out.println("The largest element is: " + large);
	
	
	}
	
	
	
}