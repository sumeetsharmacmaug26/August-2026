#include <iostream>
using namespace std;

struct Layout1
{
    char c1;
    int i;
    char c2;
};

struct Layout2
{
    int i;
    char c1;
    char c2;
};


int main()
{
    cout<<"Size of Layout1 : "<<sizeof(Layout1)<<" bytes"<<endl;
    cout<<"Size of Layout2 : "<< sizeof(Layout2) << " bytes"<<endl;
    //Why sizes differ?
    //The sizes of Layout1 and Layout 2 can differ because the members arearranged in a different order.
    //Padding is extra unused memory added by the compiler between or after members so that the data is properly aligned in memory.
    //Member order matters because it can change the amount of padding required. This is expecially important when defining network packet headers or hardware register maps where the exact memory layout is importaant.
    return 0;
}