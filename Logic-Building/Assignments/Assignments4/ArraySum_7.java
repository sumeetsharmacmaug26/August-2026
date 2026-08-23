import java.util.Scanner;

public class ArraySum_7{
	public static void main(String[] args){
		System.out.print("Enter 5 integers: ");
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		int Sum = 0;
			for(int n: arr){
				Sum = Sum + n; //n is not index it is the vslue of each array.
				
	
			} System.out.println("The Sum of all numbers is: " + Sum);
	
}
}