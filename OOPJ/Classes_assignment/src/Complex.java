
public class Complex {
	
	int real;
	
	int imag;
	
	Complex(int real, int imag){
		
		this.real = real;
		
		this.imag = imag;
		
	}
	
	public void add(Complex c) {
			
		int r = this.real + c.real;
		
		int i = this.imag + c.imag;
		
		System.out.println("Sum = "+ r + " + " + i + "i");
		
	}
	
	public void multiply(Complex c) {
		
		int r = this.real * c.real;
		
		int i = this.imag * c.imag;
		
	}
	
	public void subtract(Complex c) {
		
		int r = this.real - c.real;
		
		int i = this.imag - c.imag;
		
	
	}
	
	
	public static void main(String args[]) {
		
		
		
		System.out.println("Give the real value for Complex number 1");
		
		int real = ConsoleInput.getInt();
		
		System.out.println("Give the imag value for Complex Number 1");
		
		int imag = ConsoleInput.getInt();
		
		Complex c1 = new Complex(real, imag);
		
		System.out.println("Give the real value for Complex number 2");
		
		int real2 = ConsoleInput.getInt();
		
		
		System.out.println("Give the real value for Complex number 2");
		
		int imag2 = ConsoleInput.getInt();
		
		Complex c2 = new Complex(real2, imag2);
		
		c1.add(c2);
		
		
	}
	
	
	
}
