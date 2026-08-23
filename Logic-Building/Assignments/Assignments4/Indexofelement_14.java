import java.util.Scanner;

public class Indexofelement_14{
	public static void main(String[] args){
			System.out.println("Enter 5 integers: ");
			int arr[] = new int[5];
			Scanner sc = new Scanner(System.in);
			for(int i=0; i< arr.length; i++){
				arr[i] = sc.nextInt();
		
			}
			System.out.println("Enter the number to search: ");
			int ToSearch = sc.nextInt();
			boolean flag = true;
			for(int i=0; i<arr.length; i++){
				if(arr[i] == ToSearch){
					System.out.println("The number 15 is found at index " + i);
					flag = false;
				} 
			} if(flag){System.out.println("Not found at any index");}
	}
	
}