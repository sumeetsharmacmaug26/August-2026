#include<iostream>
using namespace std;
#include<string.h>

class Entity{

    string name;
    int health;
    int level;
    string type;
public:

Entity& setName(const string& name){
    this->name = name;
    return *this;
}

Entity& setHealth(int health){
    this->health = health;
    return *this;
}

Entity& setLevel(int level){
    this->level = level;
    return *this;
}

Entity& setType(const string& type){
    this->type = type;
    return *this;
}

string getName() const{
    return name;
}
int getHealth() const{
    return health;
}
int getLevel()  const{
    return level;
}
string getType() const{
    return type;
}

void displayInfo() const{
    cout << "Name : "<< name << endl;
    cout << "Health :"<< health << endl;
    cout << "Level :"<< level << endl;
    cout << "Type :"<< type << endl;
}

};

namespace Physics{
   
    double clamp(double val, double min, double max){
        if(val < min)
        return min;
        if(val > max)
        return max;

        return val;
    }
    double  lerp(double a, double b, double t){
        return a + (b - a) * t; // Formula for linear interpolation.
    }
}

namespace GameMath{
    int clamp(int val, int min, int max){
        if (val < min)
        return min;

        if (val > max)
        return max;

        return val;

    }
    double lerp(double a, double b, double t){
        return a + (b - a)*t;
    }


}

int main(){
    Entity player;
    Entity enemy;
    Entity item;
    cout << "========== Part A : this Pointer and Method Chaining ===========" << endl;
    player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");

    enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");

    item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

    player.displayInfo();

    enemy.displayInfo();
    
    item.displayInfo();

    cout << "=============== part B: Namespaces ================== ";

    double velocity = Physics::clamp(50, 0.0, 100.0);
    cout << "Physics Velocity = " << velocity<<endl;
   
    double Lerp_physics = Physics::lerp(60, 120, 3);
    cout << "Linear interpoltion for Physics = " << Lerp_physics <<endl;

   { using namespace GameMath;
        int integerstat = clamp(200 , 0 ,100 );
        cout <<"Game Math Integer stat = "<<integerstat<<endl;

        double UI = lerp(50.5, 100.5, 2);
        cout <<" Game Math Linear Interpolation for UI animations: "<< UI <<endl; 
     
   }

   cout<<"========== Part C: Dynamic 2D Game Map ============== "<<endl;

   cout <<"Give number of rows and then number of columns"<<endl;
   int rows;
   int columns;
   cin >> rows >> columns;

   int **map = new int*[rows];

   for (int i = 0; i < rows; i++)
   {
    map[i] = new int[columns];
   }

for(int i=0; i<rows; i++)
{
    for (int j = 0; j < columns; j++)
    {
        map[i][j] = rand() % 5;
    }
}

for(int i=0; i<rows; i++)
{
    for(int j = 0; j < columns; j++)
    {
        cout << map[i][j] << " ";
    }
    cout << endl;
}

int count[5] = {0};

for(int i=0; i< rows; i++)
{
    for(int j = 0; j < columns; j++)
    {
        count[map[i][j]]++;
    }
}

cout << "Title count: "<< endl;

cout << "Grass    :" << count[0] << endl;
cout << "Water    :" << count[1] << endl;
cout << "Mountain :" << count[2] << endl;
cout << "Forest   :" << count[3] << endl;
cout << "Dungeon  :" << count[4] << endl;

for (int i = 0; i< rows; i++)
{
    delete[] map[i];
}

delete[] map;



}