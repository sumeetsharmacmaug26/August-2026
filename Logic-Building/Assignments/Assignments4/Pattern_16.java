public class Pattern_16{
	public static void main(String[] args){
		int rows = 5;
		for(int i = 1; i <= rows; i++  ){
			
			for(int j = 1; j<= i-1; j++ ){
				System.out.print((j)+"*");
				
			}
			System.out.print(i);
			System.out.println();
		}
	}
}