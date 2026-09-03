#include<iostream>
using namespace std;
#include<string.h>

class Patient{

    int patientId;
    
    string name;
    
    int age;

    string ward;

    const string bloodGroup;

public:

    Patient() : patientId(0), name("Unknown"), age(0), ward("General"), bloodGroup("Unknown"){
    cout<<"[Constructor] Default patient registered."<<endl;
    } //Default constructor using intialiser list because bloodgroup was const so was showing the error.
        
    Patient(int patientid, const string& name):patientId(patientid), name(name), age(0), ward("General"), bloodGroup("Unknown"){
        cout<<"[Constructor] Emergency: "<<name<<endl;
    } // constructor 2 - Emergency admission: only id and name known
    
    
    Patient(int patientid, const string& name, int age, const string& ward, const string bg):patientId(patientid), name(name), age(age), ward(ward), bloodGroup(bg){
        cout<<"[Constructor] Full admission: "<<name<<endl;
    }  // constructor 3 - Full admission details

    ~Patient(){
        cout<<name<<" discharged"<<endl;
    } //destructor calling.

    void displayRecord() const{
        cout<<"ID       :   "<<patientId<<endl;
        cout<<"Name     :   "<<name<<endl;
        cout<<"Age      :   "<<age<<endl;
        cout<<"Ward     :   "<<ward<<endl;
        cout<<"Blood Grp : "<<bloodGroup<<endl;
    }


    void transferWard(const string& newWard){
        cout<<"Ward Transfer: "<<name<<"->"<<newWard;
        ward = newWard;
    }

};

int main(){
    Patient p1;     
    Patient p2(101, "Raj Patel");
    Patient p3(1001, "Meera Joshi", 34, "Cardiology", "B+");
    Patient* pts = new Patient[4];

    p3.displayRecord();


    for(int i=0; i<4; i++){
        pts[i].displayRecord();  //this will give default constructor values.
    }
    p2.transferWard("ICU");
    cout<<endl;

    delete pts;   //for dynamically created arrays.

    return 0;
}