
public class Avgarray {
	public static void main(String args[]) {
		
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
		
		int avg = TotalSum/Size;
		
		System.out.println("The Total Average of Array is: " + avg );
		
		
	}
		
		
		
		
}
