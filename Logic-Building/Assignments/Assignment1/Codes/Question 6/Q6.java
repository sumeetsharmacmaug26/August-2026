import java.util.Scanner;

public class Q6{
public static void main(String args[]){
System.out.println("Give the value of length");
Scanner sc = new Scanner(System.in);
int length = sc.nextInt();
System.out.println("Give the value of width");
int width = sc.nextInt();
int Area = length * width;
System.out.println("Area of rectangle is "+ Area);

}

}