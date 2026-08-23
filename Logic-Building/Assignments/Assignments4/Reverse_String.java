import java.util.Scanner;

public class Reverse_String{
	public static void main(String[] args){
	System.out.print("Enter a string: ");
	Scanner sc = new Scanner(System.in);
	
	String input = sc.nextLine();
	String reverse = "";
	for(int i = input.length() - 1; i >=0; i--){
			reverse = reverse + input.charAt(i);
	
	}
	System.out.print(reverse);
	
	
	
	
	}
}