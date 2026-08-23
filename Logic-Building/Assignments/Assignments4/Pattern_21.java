public class Pattern_21{
	public static void main(String args[]){
		int row = 5;
		int num = 0;
		for(int i=1; i<= row; i++){
			for(int j= 1; j <= i; j++){
				System.out.print(++num+" ");
			}
			System.out.println();
		}
	}
}