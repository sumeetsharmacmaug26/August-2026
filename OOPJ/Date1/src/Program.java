
public class Program {
	
	
	public static void main(String[] args) {
		Date obj = new Date();
		
		System.out.println("Enter the day");
		
		int day = ConsoleInput.getInt();
		
		int month = ConsoleInput.getInt();
		
		int year = ConsoleInput.getInt();
		
		
		System.out.println("Choose from the menu below:");
		
		System.out.println("1. Set Date");
		
		System.out.println("2. Add Days");
		
		System.out.println("3. Add Months");
		
		System.out.println("4. Add Years");
		
		int choice = ConsoleInput.getInt();
		
//		obj.setDate(day,month,year)
		
		switch (choice){ 
		
		case 1: 
				obj.setDate(day, month, year);
				break;
		
		case 2: 
				System.out.println("Enter number of days: ");
			
				int days = ConsoleInput.getInt();
				obj.addDays(days);
				break;
				
		case 3: System.out.println("Enter months to add: ");
		
				int months = ConsoleInput.getInt();
				obj.addMonths(months);
				break;
		
		case 4: System.out.println("Enter years to add: ");
		
				int years = ConsoleInput.getInt();
				obj.addYear(years);
				break;
		}
		
		obj.displayDate();
		
		
		
		
	}
	
}
