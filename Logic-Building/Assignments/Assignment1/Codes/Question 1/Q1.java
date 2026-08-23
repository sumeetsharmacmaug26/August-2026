import java.util.Scanner;

public class Q1{
public static void main(String args[])
{
System.out.println("Give the number to check");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if(num>0)System.out.println("Number is positive");
else System.out.println("Number is negative");
}
}