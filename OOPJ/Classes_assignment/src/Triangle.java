




public class Triangle {
	
	private int side1;
	
	private int side2;
	
	private int side3;
	
	Triangle(int s1, int s2, int s3){
		
		side1 = s1;
		
		side2 = s2;
		
		side3 = s3;
		
	}
	
	public double getArea() {
		
		int s = (side1 + side2 + side3)/2;
		
		int result1 = s*(s - side1)*(s - side2)*(s - side3);
		
		double finalArea = Math.sqrt(result1);
		
		return finalArea;
		
		
		
	}
	
	public int getPerimeter() {
		
		int perimeter = side1 + side2 + side3;
		
		return perimeter;
		
	}
	
	
	public void showPerimeter() {
		
		System.out.println("Final Perimeter is " + getPerimeter());
		
		
	}
	
	public void showArea() {
		
		System.out.println("Final Area is " + getArea());
		
	}
	
	
	
	
	public static void main(String args[])
	{	
		
		Triangle T1 = new Triangle(3,4,5);
		
		T1.showArea();
		
		T1.showPerimeter();
		
		
	}
}
