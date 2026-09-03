#include<iostream>
using namespace std;

int main(){
    int statusReg = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg = 0b11001010;

    const int* regPtr1 = &statusReg; //Read-only from firmside

    int* const regPtr2 = &controlReg; //Firmware writes here

    const int* const regPtr3 = &dataReg; // For reassignment demo

    //status reg ==> const variable
    cout<<*(regPtr1)<<endl; //prints 177 //it means reading is possible.

    //*regPtr1 = 10;                        Cant modify the value of the pointer because it is const variable. which means writing is not possible. its read only.

    cout<<statusReg<<endl; //prints 177 original value

    //status reg ==> const pointer
    cout<<controlReg<<endl; //prints 0 because initialised with 0. Original value.

    cout<<*regPtr2<<endl; //also prints 0. means reading is possible.

    *regPtr2 = 10;

     cout<<controlReg<<endl; //prints 10 . means writing is possible. / original value after assigning

      cout<<*regPtr2<<endl; //prints 10 as well, means writing is possible.

      //ROM config ==> const variable const pointer;

      cout<<dataReg<<endl; //prints 202. original value of assigning

      cout<<*regPtr3<<endl; //prints 202. means reading is possible.
      
      //*regPtr3 = 50; //error:   expression must be a modifiable lvalue. its const variable and const pointer, cant change its value so read only.


}