
public class duplicateval {
	public static void main(String args[]) {
		
	
		
		
		System.out.println("Give Size of the array");
		
		int Size = ConsoleInput.getInt();
		
		int [] duplicate = new int[Size];
		
		int [] arr = new int[Size];
		
		System.out.println("Give values of the array");
		
		for(int iTemp = 0; iTemp < Size; iTemp++ ) {
			
			arr[iTemp] = ConsoleInput.getInt();			
		}
		
		int dupindex = 0;
		
		for(int iTemp = 0; iTemp < Size - 1; iTemp++ ) {
			
			if (arr[iTemp] == arr[iTemp+1]) {
				
				duplicate[dupindex] = arr[iTemp];
				
				dupindex++;
				
			}
			
		}
		
		System.out.println("The Duplicate values are: ");
		
		for(int iTemp = 0; iTemp < dupindex; iTemp++) {
			
			System.out.print(duplicate[iTemp] + " ");
			
			}
		
		System.out.println("Total Duplicate values are:" + dupindex);
		
		
		
		}
		
		
		
		
		
	}

