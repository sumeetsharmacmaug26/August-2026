
public class SalesPerson extends Employee {
	
	
	protected float commission;

	public SalesPerson(String name, String address, int age, boolean gender, float basicSalary, float commission) {
		
		super(name, address, age, gender, basicSalary);
		
		this.commission = commission;
		
		
	}
	
	public float getcommission() {
		
		return commission;
		
	}
	
	public void setcommission(float commission) {
		this.commission = commission;
		
	}



}
