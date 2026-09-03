#include<iostream>
using namespace std;
#include<iomanip>

class Product{
    int productId;
    string name;
    double price;
    int quantity;

    public:
        void acceptDetails(){
            cout<<"Enter Product Details: "<<endl;
            cin>> productId>>name>>price>>quantity;

        } // Read all fields from user
       
        void displayDetails() const{
            cout<<productId<<setw(10)<<name<<setw(10)<<price<<setw(10)<<quantity<<setw(10)<<totalValue();  
        }// Print formatted product info;
        
        
        double totalValue() const{
                return price * quantity;
            }//price * quantity
        
        bool isLowStock(int threshold) const{
                if(quantity<threshold){
                    return true;
                } else return false;
        } //true if quantity < threshold.

        string getName() const {
            return name;
        }




};

int main(){
    
    Product field [5];
    int threshold;
    double max = 0;
    int maxindex=0;

    cout<<"Give threshold for Low Quantity";
    cin>> threshold;
    
    cout<<"Give details 1.productID, 2. name, 3.price, 4.quantity"<<endl;
    
    for(int i=0; i<5; i++){
        field[i].acceptDetails();
    }
    cout<<"===== INVENTORY REPORT ====="<<endl;
    cout<<"ID"<<setw(10)<<" Name "<<setw(10)<<" Price "<<setw(10)<< "Qty  " <<setw(10)<< "Total Value"<<endl;
    for(int i = 0; i< 5; i++){
        field[i].displayDetails();
        if(field[i].isLowStock(threshold)){
            cout << "<-- LOW STOCK";
        }  
        cout<<endl;
    }
    for(int i=0; i<5; i++){
        if(field[i].totalValue()>max){
            max = field[i].totalValue();
            maxindex = i;
        }
    }
    cout<<"Highest Value Product : "<<field[maxindex].getName()<<"(Rs., "<<max<<" )"<<endl;
    cout<<"Low Stock (threshold: "<<threshold<<" ) : ";
    for(int i =0; i<5; i++){
        if(field[i].isLowStock(threshold)){
            cout<<field[i].getName()<<", ";
            
        }
    }
    

}