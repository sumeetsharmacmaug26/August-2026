
public class Employeee {
	
	int salary;
	
	int hoursperday;
	
	
	public void getInfo(int salary, int hoursperday) {
		
		this.salary = salary;
		
		this.hoursperday = hoursperday;
		
	}
	
	public void addSal() {
		
		if (salary < 500) {
			
			salary += 10;
		
		}
		
		else salary += 0;
		
		
	}
	
	public void addWork() {
		
		if (hoursperday > 6) {
			
			salary += 5;
		}
		
		else salary += 0;
		
		
	}
	
	public void display() {
		
		System.out.println("Salary of employee is :" + salary);
		
		
	}
	
	
	
	public static void main(String args[]) {
		
		Employeee e1 = new Employeee();
		
		Employeee e2 = new Employeee();
		
		Employeee e3 = new Employeee();
		
		e1.getInfo(400, 8);
		
		e2.getInfo(600, 10);
		
		e3.getInfo(400, 8);
		
		System.out.println("Employee 1 total salary details are: ");
		
		e1.addSal();
		
		e1.addWork();
		
		e1.display();
		
		System.out.println("Employee 2 total salary details are: ");
		
		e2.addSal();
		
		e2.addWork();
		
		e2.display();
		
		
		System.out.println("Employee 3 total salary details are: ");
		
		e3.addSal();
		
		e3.addWork();
		
		e3.display();
		
			
	}
	
	
}
