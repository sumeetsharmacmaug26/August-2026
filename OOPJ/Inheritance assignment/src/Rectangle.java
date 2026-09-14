
public class Rectangle {

	int length;
	
	int breadth;
	
	
	
	Rectangle(int length, int breadth){
		
		this.length = length;
		
		this.breadth = breadth;
		
	}
	
	
	
	
	
	public void area() {
		
		int result = length * breadth;
		System.out.println("Area of Rectangle is:" + result);
		
	}
	
	public void perimeter() {
		
		int result = 2*(length + breadth);
		System.out.println("Perimeter is" + result);
		
	}
	
	public static void main(String args[]) {
		
		
		Rectangle r = new Rectangle(5,4);
		
		r.area();
		
		r.perimeter();
		
		Square s = new Square(5);
		
		s.area();
		
		s.perimeter();
		
	}
	
	
	
	
	
}
