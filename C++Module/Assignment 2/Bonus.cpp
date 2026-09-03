#include<iostream>
using namespace std;

int level =  1;

namespace Engine{
    namespace Audio {
        void playSound(string name){
            cout << name << endl;
        }
    }
}

int main(){

int level =  4;

cout << level << endl; //prints 4

cout << ::level << endl; //prints 1 (global);

Engine::Audio::playSound("sword_clash");

return 0;


}