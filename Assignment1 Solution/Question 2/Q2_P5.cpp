#include<iostream>
using namespace std;
#include<cmath>

inline double distanceBetween(double x1, double y1, double x2, double y2){
    return sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
    
}
inline double toRadians(double degrees){
    return degrees * (M_PI / 180.0);
}



inline double clamp(double value, double minVal, double maxVal){
    if(value < minVal)
        return minVal;
    if(value > maxVal)
        return maxVal;    

        return value;
}

inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){
    double distance = distanceBetween(x, y, cx, cy);
    if (distance <= radius){
        return true;
    }
    return false;
}




int main(){
    
    double homeX = 0.0;
    double homeY = 0.0;

    double radius = 50.0;

    double x1 = 30.0, y1 = 40.0;
    double x2 = 60.0, y2 = 20.0;
    double x3 = -10.0, y3 = 20.0;

    cout << "Waypoint 1: "<< distanceBetween(x1, y1, homeX, homeY)<< " units, "<<(isInSafeZone(x1, y1, homeX, homeY, radius)?"Inside":"Outside")<<endl;

    cout << "Waypoint 2: "<< distanceBetween(x2, y2, homeX, homeY)<< " units, "<<(isInSafeZone(x2, y2, homeX, homeY, radius)?"Inside":"Outside")<<endl;

    cout << "Waypoint 3: "<< distanceBetween(x3, y3, homeX, homeY)<< " units, "<<(isInSafeZone(x3, y3, homeX, homeY, radius)?"Inside":"Outside")<<endl;

    return 0;

}