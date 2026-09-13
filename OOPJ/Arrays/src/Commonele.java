
public class Commonele {
	public static void main(String args[])
	{
		
		
		System.out.println("Give the size for the array");
		
		int size = ConsoleInput.getInt();
		
		
		int arr1 [] = new int[size];
		int arr2 [] = new int[size];
		
		int common [] = new int[size];
		
		System.out.println("Give the values for arr1");
		
		for(int iTemp = 0; iTemp < size; iTemp++) {
			
			arr1[iTemp] = ConsoleInput.getInt();
			
			}
		
		System.out.println("Give the values for arr2");
		
		for(int iTemp = 0; iTemp < size; iTemp++) {
			
			arr2[iTemp] = ConsoleInput.getInt();
			
			}
		
		int comindex= 0;
		
		for(int iTemp=0; iTemp<size; iTemp++) {
			
			
			for(int jTemp=0; jTemp<size; jTemp++) {
				
				if(arr1[iTemp] == arr2[jTemp]) {
					common[comindex] = arr1[iTemp];
					comindex++;
				}
			}
			
			
			
		}
		
		System.out.print("The common elements are: ");
		
		for(int iTemp = 0; iTemp < comindex; iTemp++) {
			
			System.out.print(common[iTemp] + " ");
			
			
			
		}
		
		
		
		
		
	}
}
