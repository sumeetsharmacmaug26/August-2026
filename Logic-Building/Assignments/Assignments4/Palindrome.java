import java.util.Scanner;


public class Palindrome{
	public static void main(String[] args){
		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String reverse = "";
		for(int i= input.length()-1; i>=0; i--){
			reverse = reverse + input.charAt(i);
		
		}
		if(input.equals(reverse)){
			System.out.println("The string "+"'"+ input + "'" + " is a palindrome." );
		} else System.out.println("The string "+"'"+ input + "'" + " is not a palindrome." );
	}
}