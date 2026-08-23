import java.util.*;

public class age{

static void checkAgeCategory(int age){
	if(age<18) System.out.println("You are a minor");
	else if(age>=18 && age<= 60) System.out.println("You are an adult");
	else System.out.println("You are a senior citizen");

}

public static void main(String[] args)
{	System.out.println("Enter your age:");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	checkAgeCategory(age);
	
}


}
