import java.util.Scanner;

public class PrintArraynames_8{
	public static void main(String[] args){
		System.out.print("Enter 4 names: ");
		String arr[] = new String[4];
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextLine();
		arr[1] = sc.nextLine();
		arr[2] = sc.nextLine();
		arr[3] = sc.nextLine();
		for(String n: arr){
			System.out.println(n);
		}
	}
}