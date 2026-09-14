
public class PrimeMembers extends Member{

	int JoiningYear;
	
	int JoiningFees;
	
	int isActive;
	
	public void Display() {
		
		System.out.println(getSalary());
		
		System.out.println(getJoiningYear());
		
		System.out.println(getJoiningFees());
		
		System.out.println(getJoiningYear());
		
		System.out.println(getIsActive());
		
		
	}

	public int getJoiningYear() {
		return JoiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		JoiningYear = joiningYear;
	}

	public int getJoiningFees() {
		return JoiningFees;
	}

	public void setJoiningFees(int joiningFees) {
		JoiningFees = joiningFees;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	
}
