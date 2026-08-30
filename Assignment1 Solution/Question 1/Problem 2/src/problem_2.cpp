
#include <iostream>
using namespace std;

int main() {
	int N;


	int valid = 0;
	double validsum = 0;
	double avg;
	
	cout<<"Enter value of N"<<endl;
	cin>> N;
	double arr[N];
	cout<<"Readings entered: "<<N<<endl;
	cout<<"\nGive respective values"<<endl;
	for(int i=0; i<N; i++){
		cin>>arr[i];
		}
	cout<<"Valid readings :";
	int skip = 0;
	for(int i=0; i<N; i++){
		if (arr[i]<0){
			++skip;
			continue;
		}
		cout<<arr[i]<<" ";
		validsum = validsum + arr[i];
		valid++;
	}
	if(valid>0) avg = validsum/valid;

	cout<<"\nSkipped (errors) : "<<skip<<endl;
	
	cout<<"First CRITICAL :";
	for(int i = 0; i<N; i++){
		if(arr[i]>= 45 && arr[i]<=59){
			cout<<" Index "<<i<<" -> "<<arr[i]<<"°C"<<endl;
			break;
		}
	}

	double max = arr[0];
	double min = arr[0];
	for(int i = 0; i < N; i++){
		if(arr[i]>max){
			max = arr[i];
		}

		if(arr[i]<min && arr[i]>0){
			min = arr[i];
		}

		}
	cout<<"Max : "<<max<<"°C"<<"  Min : "<<min<<"  Avg : "<<avg<<" °C";

	int Normal = 0;
	int Warning = 0;
	int Critical = 0;
	int Shutdown = 0;

	for(int i=0; i<N; i++){
		if(arr[i]>=0 && arr[i]<=29.0) Normal++;
		else if(arr[i] >= 30.0 && arr[i] <= 44.0) Warning++;
		else if(arr[i] >= 45.0 && arr[i] <= 59.0) Critical++;
		else if(arr[i] >= 60.0) Shutdown++;
		else continue;
	}
	cout<<"\nNormal: "<<Normal<<"  Warning: "<<Warning<<"  Critical "<<Critical<<"  Shutdown: "<<Shutdown;



}
