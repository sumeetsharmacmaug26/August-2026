import java.util.Scanner;

public class PrintArray_6{
	public static void main(String[] args){
		System.out.print("Enter 5 integers: ");
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
	    arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
			for(int n : arr){
				System.out.print(n + " ");
	
			}
	}
}