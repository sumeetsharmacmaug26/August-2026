#include<iostream>
using namespace std;

void resetSensorPairV1(int reading1, int reading2){
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
    
}


void resetSensorPairV2(int &reading1, int &reading2){
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
    
}


void resetSensorPairV3(int *reading1, int *reading2){
    int temp = *reading1;
    *reading1 = *reading2;
    *reading2 = temp;
    
}


int main(){
    int A = 55;
    int B = 12;
    cout<<"--- V1: Call by Value ---"<<endl;
    resetSensorPairV1(A,B);
    cout<<"After : A = "<<A<<" B= "<<B<<"    <- Values unchanged"<<endl;
    // Why V1 fails to swap? => V1 fails to swap because we passed a value to the function, 
    //the values do got swapped but only inside the function, but it return the original value itself. This occurs beause 
    //we just give the copy of our passed values. and the swap operation is performed only on the copy values, hence the values
    //remains as it is.


    cout<<"--- V1: Call by Reference ---"<<endl;
    resetSensorPairV2(A,B);
    cout<<"After : A = "<<A<<" B= "<<B<<"    <- Values swapped"<<endl;

    cout<<"--- V1: Call by Pointer ---"<<endl;
    resetSensorPairV3(&A,&B);
    cout<<"After : A = "<<A<<" B= "<<B<<"    <- Values swapped back"<<endl;
    


}