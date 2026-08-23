import java.util.Scanner;


public class Pattern_15{
public static void main(String[] args){
	int rows = 5;
	
	for(int i = 1; i <= rows; i++){
		for(int j = 2; j <= i; j++ ){
			System.out.print(i+"*");
			
		}
		System.out.print(i);
		System.out.println();


	}
	for(int i = 1; i<= rows - 1; i++){  
		for(int j = rows - i; j>= 1; j--){
			System.out.print((rows-i+1)+"*");
	
	
		}
		System.out.print(rows-i+1);
		System.out.println();
	}
}

}