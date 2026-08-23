import java.util.Scanner;


public class CountVowels{
	public static void main(String[] args){
		System.out.print("Enter a string (only lowercase): ");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int vowels = 0;
			for(int i= 0 ; i <= input.length()-1; i++){
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
				vowels++;
			
			
			} 
		}	System.out.print("The number of vowels in "+"'"+ input + "'"+ "is: " + vowels );

	}
}