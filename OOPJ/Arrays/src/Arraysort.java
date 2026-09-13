
public class Arraysort {
	public static void main(String [] args)
	{
	
		
		System.out.println("Give Size of the array");
		
		int Size = ConsoleInput.getInt();
		
		int [] arr = new int[Size];
		
		System.out.println("Give values of the array");
		
		for(int iTemp = 0; iTemp < Size; iTemp++ ) {
			
			arr[iTemp] = ConsoleInput.getInt();			
		}
		
		for(int iTemp = 0; iTemp < Size -1 ; iTemp++) {
		
			if(arr[iTemp] > arr[iTemp + 1] ) {
				
				int temp = arr[iTemp];
				 arr[iTemp] = arr[iTemp+1];
				 arr[iTemp+1] = temp;
				}
			
			
			
		}
		
		System.out.println("Hence the sorted array elements are: ");
		
		for(int iTemp = 0; iTemp < Size; iTemp++ ) {
			
			System.out.println(arr[iTemp] + " ");
		}
		
		
		
		
	}
}
