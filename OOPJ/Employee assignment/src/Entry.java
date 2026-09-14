

public class Entry {

	public static void main(String[] args) 
	
	{	
		
		Manager [] arrManager = new Manager[40];
		
		Engineer [] arrEngineer = new Engineer[40];
		
		SalesPerson [] arrSales = new SalesPerson[40];
		
		int managercount = 0;
		
		int enggcount = 0;
		
		int Salescount = 0;
		
		int choice = 1;
		
		while(choice != 4){
			
		
		System.out.println("Menu.");
		
		System.out.println("1. Add");
		System.out.println("2. Display");
		System.out.println("3. Sort");
		System.out.println("4. Exit");
	
		
		choice = ConsoleInput.getInt();
		
		switch(choice) {
		
		case 1: 
			int choiceadd = 1;
			
			while(choiceadd != 4){System.out.println("Enter choice(Add)");
			
			System.out.println("1. Manager");
			System.out.println("2. Engineer");
			System.out.println("3. Sales Person");
			System.out.println("4. Exit to Main Menu");
			
			choiceadd = ConsoleInput.getInt();
			
			switch(choiceadd) {
			case 1: 
				
			{
				
			
				
			System.out.println("Enter the name");
			
			String name = ConsoleInput.getString();
			
			System.out.println("Enter the address");
			
			String address =  ConsoleInput.getString();
			
			System.out.println("Enter the age");
			
			int age = ConsoleInput.getInt();
			
			System.out.println("Enter the gender if Male: 1, if Female: 0");
			
			int n = ConsoleInput.getInt();
			boolean value = true;
			if(n == 0) value = false;
			else if(n == 1) value = true;
			else System.out.println("Invalid input");
			
			System.out.println("Enter the Basic Salary");
			
			float sal = ConsoleInput.getfloat(); 
			
			System.out.println("Enter the HRA");
			
			float hra = ConsoleInput.getfloat();
				
			arrManager[managercount] = new Manager(name, address, age, value, sal, hra);
			managercount++;
			
			break;
			}
			
			case 2: 
				
				{
					
					
					System.out.println("Enter the name");
				
				String name = ConsoleInput.getString();
				
				System.out.println("Enter the address");
				
				String address =  ConsoleInput.getString();
				
				System.out.println("Enter the age");
				
				int age = ConsoleInput.getInt();
				
				System.out.println("Enter the gender if Male: 1, if Female: 0");
				
				int n = ConsoleInput.getInt();
				boolean value = true;
				if(n == 0) value = false;
				else if(n == 1) value = true;
				else System.out.println("Invalid input");
				
				System.out.println("Enter the Basic Salary");
				
				float sal = ConsoleInput.getfloat(); 
				
				System.out.println("Enter the Overtime");
				
				float OT = ConsoleInput.getfloat();
					
				arrEngineer[enggcount] = new Engineer(name, address, age, value, sal, OT);
				enggcount++;
				
				break;
				}
				
			case 3:{
				
			
				
				System.out.println("Enter the name");
				
				String name = ConsoleInput.getString();
				
				System.out.println("Enter the address");
				
				String address =  ConsoleInput.getString();
				
				System.out.println("Enter the age");
				
				int age = ConsoleInput.getInt();
				
				System.out.println("Enter the gender if Male: 1, if Female: 0");
				
				int n = ConsoleInput.getInt();
				boolean value = true;
				if(n == 0) value = false;
				else if(n == 1) value = true;
				else System.out.println("Invalid input");
				
				System.out.println("Enter the Basic Salary");
				
				float sal = ConsoleInput.getfloat(); 
				
				System.out.println("Enter the Commission");
				
				float comm = ConsoleInput.getfloat();
				
				
				
				arrSales[Salescount] = new SalesPerson(name, address, age, value, sal, comm);
				Salescount++;
				
				break;
				
				
			}
				
			}	
	
			}
					
			
		case 2: //Display Manager
			
	
							System.out.println("=======Display Manager=======");
						
							for(int iTemp = 0; iTemp < managercount; iTemp++) {
								
								System.out.println("Name: "+ arrManager[iTemp].getName());
								System.out.println("Address: "+ arrManager[iTemp].getAddress());
								System.out.println("Age: "+ arrManager[iTemp].getAge());
								System.out.println("Gender: "+ arrManager[iTemp].getGender());
								System.out.println("Basic Salary: "+ arrManager[iTemp].getBasicSalary());
								System.out.println("HRA: "+ arrManager[iTemp].getHra());
								
								
								}
							
							
							System.out.println("=======Display Engineer=======");
							
							for(int iTemp = 0; iTemp < enggcount; iTemp++) {
								
								System.out.println("Name: "+ arrEngineer[iTemp].getName());
								System.out.println("Address: "+ arrEngineer[iTemp].getAddress());
								System.out.println("Age: "+ arrEngineer[iTemp].getAge());
								System.out.println("Gender: "+ arrEngineer[iTemp].getGender());
								System.out.println("Basic Salary: "+ arrEngineer[iTemp].getBasicSalary());
								System.out.println("HRA: "+ arrEngineer[iTemp].getOvertime());
								
								
								}
							
							System.out.println("=======Display Sales=======");
							
							for(int iTemp = 0; iTemp < Salescount; iTemp++) {
								
								System.out.println("Name: "+ arrSales[iTemp].getName());
								System.out.println("Address: "+ arrSales[iTemp].getAddress());
								System.out.println("Age: "+ arrSales[iTemp].getAge());
								System.out.println("Gender: "+ arrSales[iTemp].getGender());
								System.out.println("Basic Salary: "+ arrSales[iTemp].getBasicSalary());
								System.out.println("HRA: "+ arrSales[iTemp].getcommission());
								
								
								}
							
							break;
							
							
		case 3:  
			
			int sortchoice = 1;
			
			while(sortchoice != 3 ) {
				
				
					System.out.println("Sort Menu");
				
					System.out.println("1. Ascending Sort");
				
					System.out.println("2. Descending Sort");
					
					System.out.println("3. Exit to Main Menu");
					
					sortchoice = ConsoleInput.getInt();
					
					switch(sortchoice) {
					
					
					case 1: 
						// Ascending sort;
						
						for(int iTemp=0 ; iTemp < managercount - 1; iTemp++) {
							
							if(arrManager[iTemp].getName().compareTo(arrManager[iTemp+1].getName()) > 0) {
								
								Manager temp = arrManager[iTemp];
								
								arrManager[iTemp] = arrManager[iTemp+1];
								
								arrManager[iTemp+1] = temp;
								
								
							}
							
							
						}
						
						
						for(int iTemp=0; iTemp< enggcount - 1; iTemp++) {
							
							if(arrEngineer[iTemp].getName().compareTo(arrEngineer[iTemp+1].getName()) > 0) {
								
								Engineer temp = arrEngineer[iTemp];
								
								arrEngineer[iTemp] = arrEngineer[iTemp];
								
								arrEngineer[iTemp+1] = temp;
								
							}
							
							
						}
						
						for(int iTemp = 0; iTemp < Salescount - 1; iTemp++) {
							
							if(arrSales[iTemp].getName().compareTo(arrSales[iTemp+1].getName())>0) {
								
								SalesPerson temp = arrSales[iTemp];
								
								arrSales[iTemp] = arrSales[iTemp+1];
								
								arrSales[iTemp+1] = temp; 
								
							}
							
							
							
						}
						
						
						break;
					
					
					
					
					case 2:
						
							//Descending Sort
						for(int iTemp=0 ; iTemp < managercount - 1; iTemp++) {
							
							if(arrManager[iTemp].getName().compareTo(arrManager[iTemp+1].getName()) < 0) {
								
								Manager temp = arrManager[iTemp];
								
								arrManager[iTemp] = arrManager[iTemp+1];
								
								arrManager[iTemp+1] = temp;
								
								
							}
							
							
						}
						
						
						for(int iTemp=0; iTemp< enggcount - 1; iTemp++) {
							
							if(arrEngineer[iTemp].getName().compareTo(arrEngineer[iTemp+1].getName()) < 0) {
								
								Engineer temp = arrEngineer[iTemp];
								
								arrEngineer[iTemp] = arrEngineer[iTemp];
								
								arrEngineer[iTemp+1] = temp;
								
							}
							
							
						}
						
						for(int iTemp = 0; iTemp < Salescount - 1; iTemp++) {
							
							if(arrSales[iTemp].getName().compareTo(arrSales[iTemp+1].getName())<0) {
								
								SalesPerson temp = arrSales[iTemp];
								
								arrSales[iTemp] = arrSales[iTemp+1];
								
								arrSales[iTemp+1] = temp; 
								
							}
							
							
							
						}
						
						break;
					
					}
					
				
			}
						
			
			
			
							
					}
					
				}
			
			
			
			
		
		}
		 
		
	}


