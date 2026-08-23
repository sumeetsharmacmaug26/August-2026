import java.util.Scanner;

public class CountPositiveNegative_11{
	public static void main(String[] args){
		System.out.print("Enter 6 integers");
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		int countpositive = 0;
		int countnegative = 0;
		for(int i=0;i< arr.length; i++){
			arr[i] = sc.nextInt();
	
		}
		for(int i=0;i<arr.length; i++ ){
			if(arr[i] > 0){
				countpositive++;
			}if (arr[i] < 0){
				countnegative++;
			} 
		} 
		System.out.println("Positive numbers: " + countpositive );
		System.out.println("Negative numbers: " + countnegative );
	}
}