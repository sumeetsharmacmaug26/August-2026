import java.util.Scanner;

public class Positive {

static void askForPositiveNumber(int n){
	System.out.println("You entered a positive number: " + n);

}



public static void main(String[] args){

	boolean flag = true;
do{
	System.out.println("Enter a positive number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(num>0) {askForPositiveNumber(num);
	flag = false;
}
	else System.out.println("");	
} while (flag);

}
}


