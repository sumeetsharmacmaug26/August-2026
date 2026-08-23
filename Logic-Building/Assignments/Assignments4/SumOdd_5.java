import java.util.Scanner;
	public class SumOdd_5{
			public static void main(String[] args){
			System.out.print("Enter a number: ");
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			System.out.println();
			int Sum = 0;
			for(int i = 0; i<= N; i++){
					if(i%2 != 0 ){ 
					
					Sum = Sum+i;
						
				
					}
			}	System.out.println("The sum of odd numbers from 1 to " + N + " is : " + Sum);
		
			}
	}	