
public class Engineer extends Employee {
	
	protected float overtime;
	
	public Engineer(String name, String address, int age, boolean gender, float basicSalary, float overtime) {
		
		super(name, address, age, gender, basicSalary);
		
		this.overtime = overtime;
		
	}

	public float getOvertime() {
		return overtime;
	}

	public void setOvertime(float overtime) {
		this.overtime = overtime;
	}
	
	
}
