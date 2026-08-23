import java.util.Scanner;

public class Week {
public static void main(String args[])
{  
	System.out.println("Choose options:\n 1. Monday \n 2. Tuesday \n 3. Wednesday \n 4. Thursday \n 5. Friday \n 6. Saturday \n 7. Sunday  ");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	switch (choice){
	case 1: System.out.println("The Day is Monday");
	break;
	case 2: System.out.println("The Day is Tuesday");
	break;
	case 3: System.out.println("The Day is Wednesday");
	break;
	case 4: System.out.println("The Day is Thursday");
	break;
	case 5: System.out.println("The Day is Friday");
	break;
	case 6: System.out.println("The Day is Saturday");
	break;
	case 7: System.out.println("The Day is Sunday");
	break;

}
}
}