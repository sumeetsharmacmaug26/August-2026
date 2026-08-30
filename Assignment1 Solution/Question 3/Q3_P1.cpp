#include<iostream>
#include <string>
#include <iomanip>
using namespace std;


class Employee{
    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;
    static int employeeCount;

    public:

    Employee()
    {
        empId = 1000 + (++employeeCount);
        name = "";
        department = "";
        grade = 'D';
        basicSalary = 0;
        isActive = true;
    }




    void setName(const string& n){
        if(n.empty())
        {
            cout<<"ERROR: Name cannot be empty."<<endl;
        }
        else
        {
            name = n;
        }
    }
    
    void setDepartment(const string& dept){
        if(dept == "Engineering" || dept == "HR" || dept == "Finance" || dept=="Operations")
        {
            department = dept;
        } else  cout<<"Error: "<< dept<<" is not a registered department. "<<endl;
            
    } 
    
    
    void setGrade(char g){
        if(g == 'A' || g == 'B' || g == 'C' || g == 'D'){
            grade = g;
        }
        else
        {
            cout<<"ERROR: Invalid grade '"<<g<<"'. Accepted values: A, B, C, D."<<endl;
        }
    }
    
    void setBasicSalary(double salary){
        if(salary > 10000 && salary < 500000)
        {
            basicSalary = salary;
        }
        else
        {
            cout<<"ERROR: Salary must be between Rs.10000 and Rs 500000. Value rejected."<<endl;
        }
    }
    
    void deactivate(){
        isActive = false;
    }

    const int getEmpId(){
        return empId;
    }

    const string getName(){
        return name;
    }

    const string getDepartment(){
        return department;
    }

    const char getGrade(){
        return grade;
    }

   const double getBasicSalary(){
        return basicSalary;
    }

   const bool getIsActive(){
        return isActive;
    }

    double computeAllowances() const{
        switch(grade)
        {
            case 'A':
                return basicSalary * 0.40;
            case 'B':
                return basicSalary * 0.30;
            case 'C':
                return basicSalary * 0.20;
            case 'D':
                return basicSalary * 0.10;    
        }
        return 0;
    }

    double computeGrossSalary() const{
            return basicSalary + computeAllowances();
    }

 

    double computeTax() const{
        double gross = computeGrossSalary();

        if(gross <= 50000)
        {
            return 0;
        }
        else if (gross <= 100000)
        {
            return (gross - 50000) * 0.10;
        }
        else
        {
            return 5000 + (gross -  100000) * 0.20;
        }
    }

    double computeNetSalary() const{
        return computeGrossSalary() - computeTax();
    }

    void printPayslip() const
    {
        cout << fixed << setprecision(2);
        cout << "====================================="<<endl;
        cout << " EMPLOYEE PAYSLIP - AUG 2026" << endl;
        cout << "====================================="<<endl;

        cout << "Emp ID      : "<<empId << endl;
        cout << "Name        : "<< name << endl;
        cout << "Department  : "<< name << endl;
        cout << "Grade       : "<< grade <<endl;
        cout << "Status      : "
             << (isActive ? "Active" : "Inactive")<<endl;

        cout << "------------------------------------------------" << endl;
        
        cout << "Basic Salary   : Rs. " << basicSalary << endl;

        cout << "Allowances     : Rs. " << computeAllowances() << endl;

        cout << "Gross Salary   : Rs. " << computeGrossSalary() << endl;

        cout << "------------------------------------------------" << endl;

        cout << "Tax Deduction : Rs. "<< computeTax() << endl;

        cout << "Net Salary    : Rs. "<< computeNetSalary() << endl;

        cout << "------------------------------------------------" << endl;

        
    }
    static int getEmployeeCount(){
        return employeeCount;
    }

    void acceptDetails(){
        string tempName;
        string tempDepartment;
        char tempGrade;
        double tempSalary;

        cout << "Enter name: ";
        cin >> tempName;
        setName(tempName);

        cout << "Enter department: ";
        cin >> tempDepartment;
        setDepartment(tempDepartment);

        cout << "Enter grade: ";
        cin >> tempGrade;
        setGrade(tempGrade);

        cout<<"Enter basic salary";
        cin >> tempSalary;
        setBasicSalary(tempSalary);
    }

    

};


int Employee::employeeCount = 0;

int main(){

    Employee e1;

    Employee* e2 = new Employee();
    Employee* e3 = new Employee();

    e1.acceptDetails();
    e2->acceptDetails();
    e3->acceptDetails();

    e1.printPayslip();
    e2->printPayslip();
    e3->printPayslip();
    
    // Resignation

    e3->deactivate();

    if(!e3->getIsActive())
    cout << e3->getName() << "is not longer active. Payroll skipped." << endl;

    cout<<"Total Employees : " <<Employee::getEmployeeCount()<< endl;

    delete e2;
    delete e3;

    return 0;

}