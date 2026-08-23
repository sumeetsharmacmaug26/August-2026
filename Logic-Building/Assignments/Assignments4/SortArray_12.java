import java.util.Scanner;

	public class SortArray_12{
	public static void main(){
		System.out.print("Enter 5 integers:");
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		
		for(int i=0; i<= arr.length; i++ ){
			
			for(int j = i+1; j<= arr.length-1; j++){
				if(arr[i]> arr[j]){
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
				}
				
			}
			
			
		} 
		for(int i=0; i< arr.length; i++){
			System.out.print(arr[i]+ " ");
			
		}
		
	}
	}