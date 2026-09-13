
public class ComplexNumber {
	
	private	int number1;
			
	private	int number2;
	
	
	public int getNumber1() {
		
		return number1;
		
	}
	
	public int getNumber2() {
		
		return number2;
	}
	
	public void setNumber1(int number) {
		this.number1 = number;
		
	}
	
	public void setNumber2(int number) {
		
		this.number2 = number;
		
	}
	
	public  int computeComplexNumber() {
		
		int result = getNumber1() * getNumber2(); 
		
		return result;
		
	}
	
	
	
	
			
	public static void main(String args [] ) {
		
		
	ComplexNumber arr[] = new ComplexNumber[5];	
	
	for (int iTemp = 0; iTemp < 5; iTemp++) {
		
		arr[iTemp] = new ComplexNumber();
		
		System.out.println("Enter number 1: ");
		
		int n1 = ConsoleInput.getInt();
		
		System.out.println("Enter number 2: ");
		
		int n2 = ConsoleInput.getInt();
		
		arr[iTemp].setNumber1(n1);
		
		arr[iTemp].setNumber2(n2);
		
	}
	
	for (int iTemp = 0; iTemp < 5; iTemp++) {
		
		int result = arr[iTemp].computeComplexNumber();
		
		System.out.println("Result = " + result);
		
	}
	
	
	
	}	
}
