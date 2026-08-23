public class Pattern_17{
	public static void main(String[] args){
		int row = 5;
		for(int i = 1; i<= 5; i++){
			for(int j = 1; j<= i-1; j++){
				System.out.print((2*j-1)+"*");
				
	
			}
			System.out.print(2*i-1);
			System.out.println();
		}
	
	}
}