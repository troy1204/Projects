#include <iostream>
using namespace std;
int main()
{
    double p1, p2;
    cout << "Enter point 1 :" << endl; 
    cin >> p1;
    cout << "Enter point 2 :" << endl; 
    cin >> p2;
    double mp = p1 + (p2-p1)/2;
    cout << "Midpoint between " << p1 << " and " << p2 << " is :" << mp << endl;
    return 0;
}
