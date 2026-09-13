
public class SumofArray {
	public static void main(String [] args)
	{

		System.out.println("Give Size of the array");
		
		int Size = ConsoleInput.getInt();
		
		int [] arr = new int[Size];
		
		System.out.println("Give values of the array");
		
		for(int iTemp = 0; iTemp < Size; iTemp++ ) {
			
			arr[iTemp] = ConsoleInput.getInt();			
		}
		
		int TotalSum = 0;
		
		for (int iTemp = 0; iTemp < Size; iTemp++) {
			
			TotalSum += arr[iTemp];
		}
		
		System.out.println("The Total Sum of elements of array is : " + TotalSum);
		
	}
}
