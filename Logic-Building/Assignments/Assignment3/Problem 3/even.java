public class even{

static void printEvenNumbers(int num){
	if(num%2 == 0)System.out.print(num + " ");
}

public static void main(){
	int i = 2;
	while(i<=50){
	printEvenNumbers(i);
	i++;
}
}
}