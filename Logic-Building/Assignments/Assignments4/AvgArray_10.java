import java.util.Scanner;

public class AvgArray_10{
	public static void main(String[] args){
		System.out.print("Enter 5 integers: ");
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i< arr.length; i++){
				sum = sum+ arr[i];
		
		} float average = sum / (arr.length);
		System.out.print("The average of the numbers is: " + average);
	
	
	}
}