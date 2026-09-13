
public class Employee {
	
	String name;
	
	double salary;
	
	String address;
	
	int DOJ;
	
	int HoursperDay;
	
	
	Employee(String n, String add, int Dj, int HPD, double sal){
		
		name =  n;
		address = add;
		DOJ = Dj;
		HoursperDay = HPD;
		salary =  sal;
		
	}
	
	public void ShowDetails() {
		
		System.out.println(name +"       "+ DOJ +"              "+ address);
		
		
	}
	
	public void getInfo() {
		
		System.out.println("Number of work hours per day = "+ HoursperDay);
		
		System.out.println("Salary = "+ addWork());
		
		
	}
	
	public double addSal() {
		
		double addedsalary = 0;
		
		if(salary < 500)
		
		{addedsalary = salary + 10;}
		
		else 
		
		{addedsalary = salary + 0;}
		
		return addedsalary;
		
	}
	
	public double addWork() {
		
		double addedWorksal = 0;
		
		if(HoursperDay > 6) {
			
			addedWorksal = addSal() + 5;
	
		}
		
		else addedWorksal = addSal() + 0;
		
		return addedWorksal;
		
		
	}
	
	
	
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee("Robert", "64C - WallsStreat", 1994, 5, 400);
		
		Employee e2 = new Employee("Sam", "68D - WallsStreat", 2000, 8, 600);
		
		Employee e3 = new Employee("John", "26B - WallsStreat", 1999, 9, 300);
		
		System.out.println("Name     Year of joining     Address");
		
		e1.ShowDetails();
		
		e2.ShowDetails();
		
		e3.ShowDetails();
		
		
		e1.getInfo();
		
		e2.getInfo();
		
		e3.getInfo();
		
		
	}
	
	
	
}
