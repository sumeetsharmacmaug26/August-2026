
public class Date {	
		
	private int day;
	
	private int month;
	
	private int year;
	
	private int [] noOfDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
 	
	
	public void setDate(int dd, int mm, int yy)
	{
		if(yy < 1950 || yy > 3000)
			year = 2026;
		else
			year = yy;
		if(mm < 1 || mm > 12)
			month = 1;
		else
			month = mm;
		
		if (dd < 1 || dd > noOfDays[month] )
			day = 1;
		else 
			day = dd;
	}
	
	public boolean isLeapYear()
	{
		if((year % 400 == 0)|| (year % 4 == 0 && year % 100 != 0))
			{
			noOfDays[2] = 29;
			return true;
			}
		else {
			noOfDays[2] = 28;
			return false;
			}
	}
	
	public void addDays(int daysToAdd)
	{
		
		int totalDays = day + daysToAdd;
		while(totalDays > noOfDays[month])
		{
			totalDays -= noOfDays[month];
			month++;
			if(month>12)
			{
				month =1;
				year++;
			}
		}
		day = totalDays;
	}
	
	public void addMonths(int monthsToAdd)
	{
		
		isLeapYear();
		
		
		int totalMonths = month + monthsToAdd;
		
		while(totalMonths > 12) {
			totalMonths -= 12;
			year++;
			isLeapYear();
		}
		
		month = totalMonths;
		
		if(day > noOfDays[month])
			
			day = noOfDays[month];
		
	}
	
	public void addYear(int yearToAdd)
	{
		
		
		 year = year + yearToAdd;
		
		isLeapYear();
		
		if(day > noOfDays[month])
			day = noOfDays[month];		
	}
	
	public void displayDate()
	{
		
		System.out.println(day + "/" + month + "/" + year);
		
	}

}
