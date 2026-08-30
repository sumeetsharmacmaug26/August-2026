#include<iostream>
#include<cmath>
using namespace std;


double computeRMS(double* signal, int n){
    double sum = 0;
    double result;
    for(int i=0; i<n; i++){
    sum += (*(signal+i))*(*(signal + i));
    }
    result = sqrt(sum/n);
    return result;
}

void normalise(double* signal, int n)
{   
    double max = 0;
    for(int i=0; i<n; i++){
        if(fabs(*(signal + i)) > max){
        max = fabs(*(signal + i));
        }
        
    }
    for(int i = 0; i < n; i++){
            *(signal + i) = *(signal + i) / max;
        }
    
}

int countZeroCrossings(double* signal, int n){
    int count = 0;
    for(int i=0; i<n-1; i++){
        if ((*(signal+i) > 0 && *(signal+i+1) < 0) || (*(signal+i) < 0 && *(signal+i+1) > 0) ){
            count++;
        }
    } return count;
}

void applyGain(double* signal, int n, double gainFactor){
    
    for(int i =0; i<n; i++){
        *(signal  + i) = gainFactor*(*(signal + i));
    }
}

int main(){
    int Gain = 2;
    int SIZE = 7;
    double raw[SIZE];
    cout<<"Enter Rawdata"<<endl;
    for(int i=0; i<SIZE; i++){
        cin>>raw[i];
    }
    cout<<"computeRMS() = "<<computeRMS(raw, SIZE)<<endl;

    cout<<"countZeroCrossings() = "<<countZeroCrossings(raw, SIZE)<<endl;
    
    //Before calling normalise()  printing array;
    cout<<"\nBefore normalise() function"<<endl;
    for(int i=0; i<SIZE; i++){
        cout<<raw[i]<<" ";
    }
    
    normalise(raw, SIZE);

    cout<<"\nAfter normalise() function"<<endl;
    for(int i=0; i<SIZE; i++){
        cout<<raw[i]<<" ";
    }


    applyGain(raw, SIZE, Gain );

    cout<<"\nAfter applygain"<<endl;
    
    for(int i=0; i<SIZE; i++){
        cout<<raw[i]<<" ";
    }
    
    cout<<"computeRMS() = "<<computeRMS(raw, SIZE)<<endl;
    
    


}