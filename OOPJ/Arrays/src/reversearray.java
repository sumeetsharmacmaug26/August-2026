
public class reversearray {
	
public static void main(String args[]) {
		
		
		System.out.println("Give Size of the array");
		
		int Size = ConsoleInput.getInt();
		
		int [] arr = new int[Size];
		
		System.out.println("Give values of the array");
		
		for(int iTemp = 0; iTemp < Size; iTemp++ ) {
			
			arr[iTemp] = ConsoleInput.getInt();			
		}
		
		for(int iTemp = 0; iTemp < (Size / 2); iTemp++ ) {
			
			int temp = arr[iTemp];
			
			arr[iTemp] = arr[Size - iTemp -1];
		
			arr[Size - iTemp - 1] = temp;
		
		}
		
		for(int iTemp = 0; iTemp < Size; iTemp++) {
			
			System.out.println(arr[iTemp] + " ");
		}
		
		
}
	
}
