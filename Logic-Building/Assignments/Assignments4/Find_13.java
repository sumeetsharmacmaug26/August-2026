import java.util.Scanner;

public class Find_13{
	public static void main(String[] args){
		System.out.print("Enter 5 integers: ");
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		
		}
		System.out.println("Enter the number to search: ");
		int Tofind = sc.nextInt();
		boolean flag = false;
		for(int i=0; i< arr.length; i++){
			if(arr[i] == Tofind){
				flag = true;
				break;
				
			} 
		} 
		
		if(flag){
			System.out.print("Found");
		} else{ System.out.print("Not Found");
		}
	}
	
	
	
}