
#include <iostream>
#include <iomanip>
using namespace std;

int main() {
	int floor = 3;
	int room = 3;
	double arr[floor][room];
	double hotmax = 0;
	double hotmin = 0;
	int hf = 0;
	int hr = 0;
	double tempsum = 0;
	double flooravg[floor];
	int warningcount = 0;

	cout<<"Give temperature input :"<<endl;
	for(int i=0; i<floor; i++){

		for(int j = 0; j<room; j++){

			cin>>arr[i][j];
		}
	}

	cout<<setw(12)<<" ";
	cout<<setw(10)<<"Room1";
	cout<<setw(8)<<"Room2";
	cout<<setw(8)<<"Room3";
	cout<<endl;


	for(int i=0; i<floor; i++){
		cout<<setw(12)<<"Floor : "<<i+1;
		for(int j = 0; j<room; j++){

			cout<<setw(8)<<arr[i][j];
		}
		cout<<endl;
	}
	//for loop for Hottest Room and Hottest Floor
	for(int i=0; i<floor; i++){
		for(int j=0; j<room; j++){
			if(arr[i][j]>hotmax){
				hotmax = arr[i][j];
				hf = i+1;
				hr = j+1;
			}
			if(arr[i][j]<hotmin){
				hotmin = arr[i][j];
			}
			if(arr[i][j]>=30){
				warningcount++;
			}
		}
	}
	cout<<"Hottest Room  : "<<"Floor "<<hf<<", Room "<<hr<<"-> "<<hotmax<<"°C"<<endl;

	for(int i=0; i<floor; i++){
		for(int j=0; j<room; j++){
			tempsum = tempsum + arr[i][j];

		}
		flooravg[i] = (tempsum/floor);
		tempsum = 0;
	}

	if(flooravg[0]>flooravg[1]){
			if(flooravg[0]>flooravg[2]) {
				cout<<"Hottest Floor : Floor 1 (avg "<<flooravg[0]<<" °C)";
			} else cout<<"Hottest Floor : Floor 3 (avg "<<flooravg[2]<<" °C)";
		} else {
			if(flooravg[1]>flooravg[2]){
				cout<<"Hottest Floor : Floor 2 (avg "<<flooravg[1]<<" °C)";
			} else cout<<"Hottest Floor : Floor 3 (avg "<<flooravg[2]<<" °C)";
		}
	cout<<"\nRooms at WARNING or above : "<<warningcount;

	return 0;
}
