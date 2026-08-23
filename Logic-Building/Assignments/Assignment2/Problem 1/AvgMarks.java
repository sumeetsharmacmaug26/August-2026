import java.util.Scanner;

public class AvgMarks{
public static void main(String args[])
{	
	Scanner sc = new Scanner(System.in);
	System.out.println("Give Marks for maths");
	int math = sc.nextInt();
	System.out.println("Give Marks for Science");
	int Sci = sc.nextInt();
	System.out.println("Give Marks for History");
	int Hist = sc.nextInt();
	
	int avg = (math + Sci + Hist)/3;
	System.out.println("Average Marks:"+ avg);
	if(avg>=90) System.out.println("Grade A");
	else if(avg>=70 && avg<=89) System.out.println("Grade B");
	else if(avg>=50 && avg<=69) System.out.println("Grade C");
	else if(avg>=30 && avg<=49) System.out.println("Grade D");
	else System.out.println("Fail");
		
	
	
}

}