
public class Copyarray {	
	public static void main(String[] args) {
	
System.out.println("Give Size of the array");
		
		int Size = ConsoleInput.getInt();
		
		int [] arr = new int[Size];
		
		System.out.println("Give values of the array");
		
		for(int iTemp = 0; iTemp < Size; iTemp++ ) {
			
			arr[iTemp] = ConsoleInput.getInt();			
		}
		
		int [] arr2 = new int[Size];
		
		
		for (int iTemp = 0; iTemp < Size; iTemp++) {
			
			arr2[iTemp] = arr[iTemp];
			
			
		}
		
		for (int iTemp = 0; iTemp < Size; iTemp++) {
			
			System.out.println(arr2[iTemp]);
			
			
		}
		
		
		
		
		
	}
	
	
	
	
}

