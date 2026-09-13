
public class Maxmin {
	public static void main(String args[]) {
		
		int max = 0;
		
		int min;
		
		
		System.out.println("Give Size of the array");
		
		int Size = ConsoleInput.getInt();
		
		int [] arr = new int[Size];
		
		System.out.println("Give values of the array");
		
		for(int iTemp = 0; iTemp < Size; iTemp++ ) {
			
			arr[iTemp] = ConsoleInput.getInt();			
		}
		
		min = arr[0];
		
		for(int iTemp = 0; iTemp < Size; iTemp++ ) {
			
			if (arr[iTemp] > max) {
				
				max = arr[iTemp];
				
			}
			
			if (arr[iTemp] < min) {
				min = arr[iTemp];
			}
			
						
			
		}
		
		System.out.println("Maximum element of array is : "+ max);
		
		System.out.println("Minimum element of array is : "+ min);
	}
}
