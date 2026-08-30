
#include <iostream>
using namespace std;

int main() {
	double temp;
	double farhen;
	int statuscode;
	
	cout << "Enter the temperature sent by sensor in degree celsius" << endl; 
	cin >> temp;
	farhen = (temp*(9.0/5.0))+32.0;
	cout<<"Temperature : "<<temp<<"°C  /  "<<farhen<<"°F"<<endl;
	
	if(temp < 0) {
		statuscode = -1;
		cout<<"Status : SENSOR_ERROR"<<endl;
	}
	else if (temp>=0 && temp<=29) {
		statuscode = 0;
		cout<<"Status : NORMAL"<<endl;
	}
	else if (temp>=30 && temp<=44) {
		statuscode = 1;
		cout<<"Status : WARNING"<<endl;
	}
	else if (temp>=45 && temp<=59) {
		statuscode = 2;
		cout<<"Status : CRITICAL"<<endl;
	}
	else {statuscode = 3;
	cout<<"Status : SHUTDOWN"<<endl;
	}
	
	switch(statuscode){
	case -1: cout<<"Action : Sensor fault - check wiring"<<endl;
			break;
	case  0: cout<<"Action : No action required"<<endl;
			break;
	case  1: cout<<"Action : Alert sent to supervisor"<<endl;
			break;
	case  2: cout<<"Action : Cooling System triggered"<<endl;
			break;
	case  3: cout<<"Action : Emergency shutdown initiated"<<endl;
			break;
	}
	temp>25? cout<<"Reading : Above Average"<<endl:cout<<"Reading : Below Average";

}
