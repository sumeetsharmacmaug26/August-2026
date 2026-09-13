
public class Rectangle {
	
	int side1;
	
	int side2;
	
	
	Rectangle(int s1, int s2){
		
		side1 = s1;
		
		side2 = s2;
		
	}
	
	
	public int area(){
		
		int result = side1*side2;
		
		return result;
		
		
	}
	
	public void show() {
		
		System.out.println("Area is " + area());
		
		System.out.println("Length is " + side1);
		
		System.out.println("Breadth is " + side2);

		
	}
	
	
	
	
	
	
	public static void main(String args[]) {
		
		Rectangle R1 = new Rectangle(4,5);
		
		Rectangle R2 = new Rectangle(5,8);
		
		R1.show();
		
		R2.show();
		
	}
	
	
	
}
