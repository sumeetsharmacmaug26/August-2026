
#include <iostream>
using namespace std;


int main(int argc, char*argv[]) {

	if(argc < 4){
			cout<<"Usage :./sensor_monitor  <warn_threshold>  <critical_threshold>  <num_readings>"<<endl;
			cout<<"Error : Missing arguments.";
			return 1;
		}

	int Warn = stoi(argv[1]);
	int Critical = stoi(argv[2]);
	int Readings = stoi(argv[3]);

	int Normal = 0;
	int Warning = 0;
	int Criticalno = 0;
	int Shutdown = 0;
	int temp;



	cout<<"Config : Warn = "<<Warn<<"°C Critical = "<<Critical<<"°C Readings = "<<Readings<<endl;


	for(int i = 0; i < Readings; i++){
		temp = (rand() % 70);
		if(temp < Warn) Normal++;
		else if(temp > Warn && temp <= Critical) Warning++;
		else if(temp > Critical  && temp <= 59) Criticalno++;
		else Shutdown++;
	}
	cout<<"Results : Normal: "<<Normal<<" Warning: "<<Warning<<" Critical "<<Criticalno<<" Shutdown: "<<Shutdown<<endl;
}
